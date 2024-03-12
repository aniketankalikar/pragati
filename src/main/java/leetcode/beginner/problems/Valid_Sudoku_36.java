package leetcode.beginner.problems;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Valid_Sudoku_36 {

	public static void main(String args[]) {

		char[][] board = { { '5', '3', '.', '.', '7', '.', '.', '.', '.' },
				{ '6', '.', '.', '1', '9', '5', '.', '.', '.' }, { '.', '9', '8', '.', '.', '.', '.', '6', '.' },
				{ '8', '.', '.', '.', '6', '.', '.', '.', '3' }, { '4', '.', '.', '8', '.', '3', '.', '.', '1' },
				{ '7', '.', '.', '.', '2', '.', '.', '.', '6' }, { '.', '6', '.', '.', '.', '.', '2', '8', '.' },
				{ '.', '.', '.', '4', '1', '9', '.', '.', '5' }, { '.', '.', '.', '.', '8', '.', '.', '7', '9' } };

		boolean res = new Valid_Sudoku_36().isValidSudoku(board);
		System.out.println(res);
	}

	public boolean isValidSudoku(char[][] board) {

		List<Set<Character>> rows = new ArrayList<>(board.length);
		List<Set<Character>> cols = new ArrayList<>(board[0].length);
		Map<String, Set<Character>> sqaures = new HashMap<>();

		for (int i = 0; i < board.length; i++) {
			rows.add(i, new HashSet<Character>());
			for (int j = 0; j < board[i].length; j++) {
				cols.add(j, new HashSet<Character>());
				System.out.println("-----------------------------------------------------");
				System.out.println("row No " + i);
				System.out.println("col No " + i);
				System.out.println("char on board " + board[i][j]);
				System.out.println("row display " + rows);
				System.out.println("col display " + cols);
				System.out.println("squares display " + sqaures);

				if (board[i][j] == '.')
					continue;
				
				

				if ((rows.get(i) != null && rows.get(i).contains(board[i][j]))
						|| (cols.get(j) != null && cols.get(j).contains(board[i][j]))
						|| (sqaures.get(String.valueOf(i / 3) + String.valueOf(j / 3)) != null
								&& sqaures.get(String.valueOf(i / 3) + String.valueOf(j / 3)).contains(board[i][j]))) {
					return false;
				} else {
					if (rows.get(i) == null) {
						Set<Character> rowSet = new HashSet<>();
						rowSet.add(board[i][j]);
						rows.set(i, rowSet);
					} else
						rows.get(i).add(board[i][j]);

					if (cols.get(j) == null) {
						Set<Character> colSet = new HashSet<>();
						colSet.add(board[i][j]);
						cols.set(j, colSet);
					} else
						cols.get(j).add(board[i][j]);

					if (sqaures.get(String.valueOf(i / 3) + String.valueOf(j / 3)) == null) {
						sqaures.put(String.valueOf(i / 3) + String.valueOf(j / 3), new HashSet<>());
						sqaures.get(String.valueOf(i / 3) + String.valueOf(j / 3)).add(board[i][j]);
					} else {
						sqaures.get(String.valueOf(i / 3) + String.valueOf(j / 3)).add(board[i][j]);
					}
				}
			}

		}

		return true;
	}

}
