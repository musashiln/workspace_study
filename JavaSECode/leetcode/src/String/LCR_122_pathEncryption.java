package String;

/**
 * ClassName: LCR_122_pathEncryption
 * Package: String
 * Description:
 *
 * @Author gxy
 * @Create 2025/12/28 22:29
 * @Version 1.0
 */
public class LCR_122_pathEncryption {
    public static void main(String[] args) {
        Solution2 solution2 = new Solution2();
        System.out.println(solution2.pathEncryption("a.aef.qerf.bb"));
    }
}

class Solution2 {
    public String pathEncryption(String path) {
        char[] chars = path.toCharArray();
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < chars.length; i++) {
            if(chars[i] == '.') {
                stringBuilder.append(" ");
            } else {
                stringBuilder.append(chars[i]);
            }
        }
        return new String(stringBuilder);
    }
}
