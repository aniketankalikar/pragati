package hackerrank.wisetech_29_oct_2023;

import java.io.*;
import java.util.*;
import java.util.stream.*;

import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class Q1 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        int log_dataRows = Integer.parseInt(bufferedReader.readLine().trim());
        int log_dataColumns = Integer.parseInt(bufferedReader.readLine().trim());

        List<List<Integer>> log_data = new ArrayList<>();

        IntStream.range(0, log_dataRows).forEach(i -> {
            try {
                log_data.add(
                        Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                                .map(Integer::parseInt)
                                .collect(toList())
                );
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        int queryCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> query = IntStream.range(0, queryCount).mapToObj(i -> {
                    try {
                        return bufferedReader.readLine().replaceAll("\\s+$", "");
                    } catch (IOException ex) {
                        throw new RuntimeException(ex);
                    }
                })
                .map(String::trim)
                .map(Integer::parseInt)
                .collect(toList());

        int X = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> result = Q1.getStaleServerCount(n, log_data, query, X);

        bufferedWriter.write(
                result.stream()
                        .map(Object::toString)
                        .collect(joining("\n"))
                        + "\n"
        );

        bufferedReader.close();
        bufferedWriter.close();
    }

    /*
     * Complete the 'getStaleServerCount' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts following parameters:
     *  1. INTEGER n
     *  2. 2D_INTEGER_ARRAY log_data
     *  3. INTEGER_ARRAY query
     *  4. INTEGER X
     */
    public static List<Integer> getStaleServerCount(int n, List<List<Integer>> log_data, List<Integer> query, int X) {

        Map<Integer, List<Integer>> dataAsMap = new HashMap<>();
        List<Integer> result = new ArrayList<>();

        for (List<Integer> row : log_data) {
            Integer serverId = row.get(0);
            Integer interval = row.get(1);
            List<Integer> rowInMap = dataAsMap.get(interval);
            if (rowInMap == null) {
                rowInMap = new ArrayList<>();
                dataAsMap.put(interval, rowInMap);
            }
            rowInMap.add(serverId);
        }
        for (int i = 0; i < query.size(); i++) {
            int count = 0;
            int startInterval = query.get(i) - X;
            int endInterval = query.get(i);
            while (startInterval <= endInterval) {
                if (!dataAsMap.containsKey(startInterval))
                    count++;

                startInterval++;
            }

            result.add(count);
        }


        return result;
    }
}
