package HashTable;

import java.util.HashSet;
import java.util.Set;

/**
 * ClassName: _202_happy_number
 * Package: HashTable
 * Description:
 *
 * @Author gxy
 * @Create 2025/12/23 17:54
 * @Version 1.0
 */
public class _202_happy_number {
    public static void main(String[] args) {
        Solution2 solution2 = new Solution2();
        System.out.println(solution2.isHappy(2));
    }
}

class Solution2 {
    public boolean isHappy(int n) {
        Set<Integer> res = new HashSet<>();
        while(n != 1 && !res.contains(n)) {
            res.add(n);
            n = calculate(n);
        }
        return n == 1;
    }

    public int calculate(int n) {
        int sum = 0;
        while (n > 0) {
            int temp = n % 10;
            sum += temp * temp;
            n = n / 10;
        }
        return sum;
    }

}
