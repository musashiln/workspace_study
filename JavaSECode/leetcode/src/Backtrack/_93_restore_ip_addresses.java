package Backtrack;

import java.util.ArrayList;
import java.util.List;

/**
 * ClassName: _93_restore_ip_addresses
 * Package: Backtrack
 * Description:
 *
 * @Author gxy
 * @Create 2026/1/26 19:02
 * @Version 1.0
 */
public class _93_restore_ip_addresses {
    public static void main(String[] args) {
        Solution6 solution = new Solution6();
        List<String> list = solution.restoreIpAddresses("25525511135");
        System.out.println(list);
    }
}

/**
 * 怎么确定分割的长度？
 * 终止条件：判断是三个逗点，判断最后剩下的子串合法（逗点实际上控制了递归深度，每次递归应该传入逗点数量）
 * for循环：逗点前面的在循环中加合法判断，如果超长（实际上是转化为数字的比较）就不能进入下一层递归，并且break，相当于剪枝
 *
 * 不需要使用path，每一个结果都是一个串
 *
 * 代码注意：
 * 1.isValid函数：
 * 要有start > index判断；
 * num = num * 10 + (s.charAt(i) - '0');注意字符串的转换；
 * 2.递归中因为加了"."，startIndex应该传入i + 2
 */
class Solution6 {
    List<String> res = new ArrayList<>();
    public List<String> restoreIpAddresses(String s) {
        StringBuilder sb = new StringBuilder(s);
        backTracking(sb, 0, 0);
        return res;
    }

    public void backTracking(StringBuilder s, int startIndex, int dotCount) {
        if (dotCount == 3) {
            if (isValid(s, startIndex, s.length() - 1)) {
                res.add(s.toString());
            }
            return;
        }
        for (int i = startIndex; i < s.length(); i++) {
            if (isValid(s, startIndex, i)) {
                s.insert(i + 1, ".");
                backTracking(s, i + 2, dotCount + 1);
                s.deleteCharAt(i + 1);
            } else {
                break;
            }
        }
    }

    public boolean isValid(StringBuilder s, int start, int end) {
        //注意这个判断不能丢
        if (start > end) {
            return false;
        }
        if (s.charAt(start) == '0' && start != end) {
            return false;
        }
        int num = 0;
        for (int i = start; i <= end ; i++) {
            num = num * 10 + (s.charAt(i) - '0');
            if (num > 255) {
                return false;
            }
        }
        return true;
    }
}
