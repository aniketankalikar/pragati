package hackerrank.wisetech_29_oct_2023;


import java.io.*;
import java.util.*;
import java.util.stream.*;

import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class Q2 {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int productsRows = Integer.parseInt(bufferedReader.readLine().trim());
        int productsColumns = Integer.parseInt(bufferedReader.readLine().trim());

        List<List<String>> products = new ArrayList<>();

        IntStream.range(0, productsRows).forEach(i -> {
            try {
                products.add(
                        Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                                .collect(toList())
                );
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        int discountsRows = Integer.parseInt(bufferedReader.readLine().trim());
        int discountsColumns = Integer.parseInt(bufferedReader.readLine().trim());

        List<List<String>> discounts = new ArrayList<>();

        IntStream.range(0, discountsRows).forEach(i -> {
            try {
                discounts.add(
                        Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                                .collect(toList())
                );
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        int result = new Result().findLowestPrice(products, discounts);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }

}