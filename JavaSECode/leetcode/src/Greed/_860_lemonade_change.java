package Greed;

/**
 * ClassName: _860_lemonade_change
 * Package: Greed
 * Description:
 *
 * @Author gxy
 * @Create 2026/2/14 19:00
 * @Version 1.0
 */
public class _860_lemonade_change {
    public static void main(String[] args) {
        Solution9 solution9 = new Solution9();
        int[] bills = {5,5,5,10,20};
        System.out.println(solution9.lemonadeChange(bills));
    }
}

class Solution9 {
    public boolean lemonadeChange(int[] bills) {
        int five = 0;
        int ten = 0;
        int twenty = 0;
        for (int i = 0; i < bills.length; i++) {
            if (bills[i] == 5) {
                five++;
            }
            if (bills[i] == 10) {
                if (five == 0) {
                    return false;
                } else {
                    five--;
                    ten++;
                }
            }
            if (bills[i] == 20) {
                if (five > 0 && ten > 0) {
                    five--;
                    ten--;
                    twenty++;
                } else if (five >= 3) {
                    five -= 3;
                    twenty++;
                } else {
                    return false;
                }
            }
        }
        return true;
    }
}
