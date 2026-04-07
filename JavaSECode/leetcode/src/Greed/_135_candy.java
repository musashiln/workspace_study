package Greed;

import java.util.Arrays;

/**
 * ClassName: _135_candy
 * Package: Greed
 * Description:
 *
 * @Author gxy
 * @Create 2026/2/14 18:29
 * @Version 1.0
 */
public class _135_candy {
    public static void main(String[] args) {
        int[] ratings = {1,0,2};
        Solution8 solution8 = new Solution8();
        System.out.println(solution8.candy(ratings));
    }
}

class Solution8 {
    public int candy(int[] ratings) {
        int[] candy = new int[ratings.length];
        Arrays.fill(candy, 1);
        for (int i = 1; i < ratings.length; i++) {
            if (ratings[i] > ratings[i - 1]) {
                candy[i] = candy[i - 1] + 1;
            }
        }
        for (int i = ratings.length - 2; i >= 0 ; i--) {
            if (ratings[i] > ratings[i + 1]) {
                candy[i] = Math.max(candy[i + 1] + 1, candy[i]);
            }
        }
        int sum = 0;
        for (int i : candy) {
            sum += i;
        }
        return sum;
    }
}
