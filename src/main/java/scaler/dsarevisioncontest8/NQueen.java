package scaler.dsarevisioncontest8;

import java.util.ArrayList;

public class NQueen {

    ArrayList<ArrayList<String>> ans = new ArrayList<ArrayList<String>>();

    public ArrayList<ArrayList<String>> solveNQueens(int A) {
        Character[][] mat = new Character[A][A];
        for (int i = 0; i < A; i++) {
            for (int j = 0; j < A; j++) {
                mat[i][j] = '.';
            }
        }

        nQueens(mat, 0, A);
        return ans;
    }

    private void nQueens(Character[][] mat, int row, int N) {
        if (row == N) {
            // Add the matrix to the final matrix
            ans.add(toString(mat)); // Add it to the final ans List.
        }

        for (int col = 0; col < N; col++) {
            if (isValid(mat, row, col)) {
                mat[row][col] = 'Q'; // Add the 'Q' to specific index
                nQueens(mat, row + 1, N);
                mat[row][col] = '.'; // Revert from 'Q' to '.' as in the beginning.
            }
        }
    }

    boolean isValid(Character[][] mat, int i, int j) { // check valid position
        int r = 0, c = 0;
        for (r = 0; r < i; r++) {
            if (mat[r][j] == 'Q') {
                return false;
            }
        }
        r = i - 1;
        c = j + 1;
        while (r >= 0 && c < mat[0].length) {
            if (mat[r][c] == 'Q')
                return false;
            r--;
            c++;
        }

        r = i - 1;
        c = j - 1;
        while (r >= 0 && c >= 0) {
            if (mat[r][c] == 'Q')
                return false;
            r--;
            c--;
        }
        return true;
    }

    public ArrayList<String> toString(Character[][] mat) { // converting each row to a Strng
        // Add it to a list. Which ultimately prepares a ArrayList<String>.
        ArrayList<String> stringList = new ArrayList<String>();

        for (int i = 0; i < mat.length; i++) {
            StringBuilder builder = new StringBuilder();
            for (int j = 0; j < mat[0].length; j++) {
                builder.append(mat[i][j]);
            }
            stringList.add(builder.toString());
        }
        return stringList;
    }

}

