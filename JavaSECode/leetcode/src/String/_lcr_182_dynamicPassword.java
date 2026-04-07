package String;

/**
 * ClassName: _lcr_182_dynamicPassword
 * Package: String
 * Description:
 *
 * @Author gxy
 * @Create 2025/12/29 8:15
 * @Version 1.0
 */
public class _lcr_182_dynamicPassword {
    public static void main(String[] args) {
        Solution3 solution3 = new Solution3();
        System.out.println(solution3.dynamicPassword("s3cur1tyC0d3", 4));
        System.out.println(solution3.dynamicPassword1("s3cur1tyC0d3", 4));
    }
}

class Solution3 {
    /**
     * substring左闭右开
     * @param password
     * @param target
     * @return
     */
    public String dynamicPassword(String password, int target) {
        return password.substring(target, password.length()) + password.substring(0, target);
    }

    /**
     *
     * @param password
     * @param target
     * @return
     */
    public String dynamicPassword1(String password, int target) {
        char[] chars = password.toCharArray();
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = target; i < chars.length; i++) {
            stringBuilder.append(chars[i]);
        }
        for (int i = 0; i < target; i++) {
            stringBuilder.append(chars[i]);
        }
        return new String(stringBuilder);
    }
}
