package _array;

/**
 * ClassName: _59_spiral_matrix_ii
 * Package: _array
 * Description:
 *
 * @Author gxy
 * @Create 2025/12/12 22:48
 * @Version 1.0
 */
public class _59_spiral_matrix_ii {
    public int[][] generateMatrix(int n) {
        int[][] nums = new int[n][n];
        int startX = 0, startY = 0;
        int loop = 1;
        int offset = 1;
        int count = 1;
        int i,j;
        while (loop <= n / 2) {
            for (j = startY; j < n - offset; j++) {
                nums[startX][j] = count++;
            }
            for (i = startX; i < n - offset; i++) {
                nums[i][j] = count++;
            }
            for (; j > startY; j--) {
                nums[i][j] = count++;
            }
            for (; i > startX; i--) {
                nums[i][j] = count++;
            }
            startX++;
            startY++;
            offset++;
            loop++;
        }
        if(n % 2 == 1) {
            nums[startX][startY] = count;
        }
        return nums;
    }

}

class generateMatrixTest {
    public static void main(String[] args) {
        _59_spiral_matrix_ii spiral_matrix_ii = new _59_spiral_matrix_ii();
        int[][] nums = spiral_matrix_ii.generateMatrix(3);
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                System.out.print(nums[i][j] + " ");
            }
            System.out.println("");
        }
    }
}