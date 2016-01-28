package solution;

/**
 * Created by yuxiaofei on 2016/1/28.
 */
public class Q036 {
    boolean[] dup = new boolean[10];

    public boolean isValidSudoku(char[][] board) {
        return validateRow(board) && validateColumn(board) && validateNineCell(board);
    }

    public boolean validateRow(char[][] board) {
        for (int i = 0; i < 9; i++) {
            initDup();
            for (int j = 0; j < 9; j++) {
                char c = board[i][j];
                if (isDuplicate(c)) {
                    return false;
                }
            }
        }
        return true;
    }

    public boolean validateColumn(char[][] board) {
        for (int i = 0; i < 9; i++) {
            initDup();
            for (int j = 0; j < 9; j++) {
                char c = board[j][i];
                if (isDuplicate(c)) {
                    return false;
                }
            }
        }
        return true;
    }

    public boolean validateNineCell(char[][] board) {
        for (int i = 0; i < 9; i += 3) {
            for (int j = 0; j < 9; j += 3) {
                if (!checkNine(board, i, j)) {
                    return false;
                }
            }
        }
        return true;
    }

    public void initDup() {
        for (int i = 0; i < dup.length; i++) {
            dup[i] = false;
        }
    }

    public boolean checkNine(char[][] board, int row, int col) {
        initDup();
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                char c = board[row + i][col + j];
                if (isDuplicate(c))
                    return false;
            }
        }
        return true;
    }

    public boolean isDuplicate(char c) {
        if (c != '.') {
            if (dup[c - '0']) {
                return true;
            } else {
                dup[c - '0'] = true;
            }
        }
        return false;
    }
}
