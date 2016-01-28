package solution;

/**
 * Created by yuxiaofei on 2016/1/29.
 */
public class Q036_2 {

    public boolean isValidSudoku(char[][] board) {
        if (board == null) {
            return false;
        }
        for (int i = 0; i < 9; i++) {
            int col = 0;
            int row = 0;
            int block = 0;
            for (int j = 0; j < 9; j++) {
                int rowVal = board[i][j] - '1';
                int colVal = board[j][i] - '1';
                int blockVal = board[i / 3 * 3 + j / 3][i % 3 * 3 + j % 3] - '1';
                if (rowVal >= 0 && (row & (1 << rowVal)) != 0
                        || colVal >= 0 && (col & (1 << colVal)) != 0
                        || blockVal >= 0 && (block & (1 << blockVal)) != 0) {
                    return false;
                }
                row |= rowVal >= 0 ? 1 << rowVal : 0;
                col |= colVal >= 0 ? 1 << colVal : 0;
                block |= blockVal >= 0 ? 1 << blockVal : 0;
            }
        }
        return true;
    }
}
