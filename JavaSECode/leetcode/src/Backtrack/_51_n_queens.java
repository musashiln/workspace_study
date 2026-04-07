package Backtrack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * ClassName: _51_n_queens
 * Package: Backtrack
 * Description:
 *
 * @Author gxy
 * @Create 2026/1/29 22:43
 * @Version 1.0
 */
public class _51_n_queens {
    public static void main(String[] args) {
        Solution12 solution = new Solution12();
        List<List<String>> lists = solution.solveNQueens(4);
        System.out.println(lists);
    }
}

class Solution12 {

    List<List<String>> res = new ArrayList<>();

    public List<List<String>> solveNQueens(int n) {
        char[][] chessboard = new char[n][n];
        for (char[] chars : chessboard) {
            Arrays.fill(chars, '.');
        }
        backTracking(n, chessboard, 0);
        return res;
    }

    public void backTracking(int n, char[][] chessboard, int row) {
        if (row == n) {
            res.add(ArrayToList(chessboard));
            return;
        }
        //只需要一层for循环遍历一行，递归来遍历列，然后一行一列确定皇后的唯一位置。
        for (int col = 0; col < n; col++) {
            if (isValid(n, row, col, chessboard)) {
                chessboard[row][col] = 'Q';
                backTracking(n, chessboard, row + 1);
                chessboard[row][col] = '.';
            }
        }
    }

    private boolean isValid(int n, int row, int col, char[][] chessboard) {
        for (int i = 0; i < row; i++) {
            if (chessboard[i][col] == 'Q') {
                return false;
            }
        }
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0 ; i--, j--) {
            if (chessboard[i][j] == 'Q') {
                return false;
            }
        }
        for (int i = row - 1, j = col + 1; i >= 0 && j < n ; i--, j++) {
            if (chessboard[i][j] == 'Q') {
                return false;
            }
        }
        return true;
    }

    public List<String> ArrayToList(char[][] chessboard) {
        List<String> list = new ArrayList<>();
        for (char[] chars : chessboard) {
            list.add(new String(chars));
        }
        return list;
    }
}
