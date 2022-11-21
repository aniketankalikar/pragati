package scaler.academy.contest1;

import java.util.ArrayList;
import java.util.Scanner;

public class Q4 {

	public static void main(String args[]) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter line1 ");
		String line1 = scanner.nextLine();
		System.out.println("line1 --> " + line1);

		String[] line1Arr = line1.split(" ");
		Integer N = Integer.parseInt(line1Arr[0]);
		Integer M = Integer.parseInt(line1Arr[1]);
		Integer Q = Integer.parseInt(line1Arr[2]);
		System.out.println("N --> " + N);
		System.out.println("M --> " + M);
		System.out.println("Q --> " + Q);

		ArrayList<ArrayList<Integer>> input = new ArrayList<ArrayList<Integer>>();
		int idxValue = 1;
		for (int i = 0; i < N; i++) {
			input.add(i, new ArrayList<Integer>(M));
			for (int j = 0; j < M; j++) {
				input.get(i).add(j, idxValue);
				idxValue++;
			}
		}

		ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
		result.add(new ArrayList<Integer>());

		scanner = new Scanner(System.in);
		System.out.println("Enter Query1 ");
		String query = scanner.nextLine();
		System.out.println("query1 --> " + query);

		processQuery(query, input, result);

		scanner = new Scanner(System.in);
		System.out.println("Enter Query2 ");
		query = scanner.nextLine();
		System.out.println("query2 --> " + query);

		processQuery(query, input, result);

		scanner = new Scanner(System.in);
		System.out.println("Enter Query3 ");
		query = scanner.nextLine();
		System.out.println("query3 --> " + query);
		processQuery(query, input, result);

		scanner = new Scanner(System.in);
		System.out.println("Enter Query4 ");
		query = scanner.nextLine();
		System.out.println("query4 --> " + query);
		processQuery(query, input, result);

		System.out.println("Bitwise OR, AND  Result "+result);
		
		scanner.close();
	}

	private static void processQuery(String query, ArrayList<ArrayList<Integer>> input,
			ArrayList<ArrayList<Integer>> result) {

		int C1, C2, R1, R2, X1, X2, Y1, Y2;

		String[] queryArr = query.split(" ");

		if (queryArr[0].equalsIgnoreCase("1")) {
			C1 = Integer.parseInt(queryArr[1]);
			C2 = Integer.parseInt(queryArr[2]);
			swapColumns(C1, C2, input);
		}

		else if (queryArr[0].equalsIgnoreCase("2")) {
			R1 = Integer.parseInt(queryArr[1]);
			R2 = Integer.parseInt(queryArr[2]);
			swapRows(R1, R2, input);
		} else if (queryArr[0].equalsIgnoreCase("3")) {
			X1 = Integer.parseInt(queryArr[1])-1;
			Y1 = Integer.parseInt(queryArr[2])-1;
			X2 = Integer.parseInt(queryArr[3])-1;
			Y2 = Integer.parseInt(queryArr[4])-1;

			result.get(0).add(input.get(X1).get(Y1) | input.get(X2).get(Y2));
			

		} else if (queryArr[0].equalsIgnoreCase("4")) {
			X1 = Integer.parseInt(queryArr[1])-1;
			Y1 = Integer.parseInt(queryArr[2])-1;
			X2 = Integer.parseInt(queryArr[3])-1;
			Y2 = Integer.parseInt(queryArr[4])-1;
			result.get(0).add(input.get(X1).get(Y1) & input.get(X2).get(Y2));
			
		}

	}

	private static void swapRows(int r1, int r2, ArrayList<ArrayList<Integer>> input) {

		int r1Index = r1 - 1;
		int r2Index = r2 - 1;
		int cols = input.get(0).size();
		for (int j = 0; j < cols; j++) {
			int temp = input.get(r1Index).get(j);
			int row2Val = input.get(r2Index).get(j);
			input.get(r1Index).set(j, row2Val);
			input.get(r2Index).set(j, temp);

		}
		System.out.println("Swapped Rows \n" + input);

	}

	private static void swapColumns(int c1, int c2, ArrayList<ArrayList<Integer>> input) {

		int c1Index = c1 - 1;
		int c2Index = c2 - 1;
		int rows = input.size();
		for (int i = 0; i < rows; i++) {

			int temp = input.get(i).get(c1Index);
			int c2Val = input.get(i).get(c2Index);
			input.get(i).set(c1Index, c2Val);
			input.get(i).set(c2Index, temp);

		}

		System.out.println("Swapped Columns \n" + input);

	}

}
