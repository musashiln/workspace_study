package Backtrack;

import java.util.Arrays;
import java.util.List;

/**
 * ClassName: _37_sudoku_solver
 * Package: Backtrack
 * Description:
 *
 * @Author gxy
 * @Create 2026/1/30 22:47
 * @Version 1.0
 */
public class _37_sudoku_solver {
    public static void main(String[] args) {
        char[][] board = {
                {'5', '3', '.', '.', '7', '.', '.', '.', '.'},
                {'6', '.', '.', '1', '9', '5', '.', '.', '.'},
                {'.', '9', '8', '.', '.', '.', '.', '6', '.'},
                {'8', '.', '.', '.', '6', '.', '.', '.', '3'},
                {'4', '.', '.', '8', '.', '3', '.', '.', '1'},
                {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
                {'.', '6', '.', '.', '.', '.', '2', '8', '.'},
                {'.', '.', '.', '4', '1', '9', '.', '.', '5'},
                {'.', '.', '.', '.', '8', '.', '.', '7', '9'}
        };
        Solution13 solution = new Solution13();
        solution.solveSudoku(board);
        System.out.println(Arrays.deepToString(board));
    }
}

/**
 * 为什么要用二层循环？
 * 与使用了一层循环的n皇后对比，n皇后是每一行放了一个皇后，就可以递归下一行，其中行数就是递归深度；
 * 而数独是每一个格子都要放一个数，也就是每一个格子都需要递归
 *
 * 为什么函数返回boolean?
 * 因为是找到一个结果就立刻返回，也就是出现一个格子填满的情况，就直接返回true
 */
class Solution13 {
    public void solveSudoku(char[][] board) {
        backTracking(board);
    }

    public boolean backTracking(char[][] board) {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (board[i][j] != '.') {
                    continue;
                }
                for (char k = '1'; k <= '9'; k++) {
                    if (isValid(i ,j ,k, board)) {
                        board[i][j] = k;
                        if (backTracking(board)) {
                            // 如果找到合适一组立刻返回
                            return true;
                        }
                        board[i][j] = '.';
                    }
                }
                return false;
                // 因为如果一行一列确定下来了，这里尝试了9个数都不行，说明这个棋盘找不到解决数独问题的解！
                // 那么会直接返回， 「这也就是为什么没有终止条件也不会永远填不满棋盘而无限递归下去！」
            }
        }
        // 遍历完没有返回false，说明找到了合适棋盘位置了
        return true;
    }

    private boolean isValid(int row, int col, int k, char[][] board) {
        for (int i = 0; i < 9; i++) {
            if (board[row][i] == k) {
                return false;
            }
        }
        for (int i = 0; i < 9; i++) {
            if (board[i][col] == k) {
                return false;
            }
        }
        int startRow = (row / 3) * 3;
        int startCol = (col / 3) * 3;
        for (int i = startRow; i < startRow + 3; i++) {
            for (int j = startCol; j < startCol + 3; j++) {
                if (board[i][j] == k) {
                    return false;
                }
            }
        }
        return true;
    }
}
