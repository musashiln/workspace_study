package atguigu01.string.exer2;

import org.junit.Test;

import java.util.Arrays;

/**
 * ClassName: StringTest
 * Package: atguigu01.string.exer2
 * Description:
 *
 * @Author gxy
 * @Create 2025/4/20 20:18
 * @Version 1.0
 */
public class StringTest {
    /*
     * 题目2:将一个字符串进行反转。将字符串中指定部分进行反转。
     * 比如"abcdefg"反转为"abfedcg"
    * */

    @Test
    public void test(){
        String s = "abcdefg";
        String s1 = reverse(s, 2, 5);
        String s2 = reverse1(s, 2, 5);
        System.out.println(s1);
        System.out.println(s2);
        s = "abkkcadkabkebfkabkskab";
        System.out.println(getSubStringCount(s, "ab"));

    }

    /**
     * 方式1:将String转为char[],针对char[]数组进行相应位置的反转,反转以后将char[]转为String
     * @param str
     * @param fromIndex
     * @param toIndex
     * @return
     */
    public String reverse(String str, int fromIndex ,int toIndex){
        char[] arr = str.toCharArray();
        for (int i = fromIndex,j = toIndex; i < j; i++, j--) {
            char temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        return new String(arr);
    }

    public String reverse1(String str, int fromIndex ,int toIndex){
        char[] arr = str.toCharArray();
        for (int i = fromIndex,j = toIndex; i < j; i++, j--) {
            char temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        return new String(arr);
    }

    public String reverse2(String str, int fromIndex ,int toIndex){
        String finalStr = str.substring(0, fromIndex);
        for (int i = toIndex; i >= fromIndex; i++) {
            finalStr += str.charAt(i);
        }
        finalStr += str.substring(toIndex + 1);
        return finalStr;
    }

    /**
     * 题目3:获取一个字符串在另一个字符串中出现的次数。
     * 比如:获取"ab"在"abkkcadkabkebfkabkskab"中出现的次数
     */

    /**
     * @description:
     * @param: [str, subStr]
     * @return: int
     **/
    public int getSubStringCount(String str, String subStr) {
        int count = 0;
        if (str.length() >= subStr.length()) {
            int index = str.indexOf(subStr);
            while (index >= 0){
                count++;
                index = str.indexOf(subStr,index + subStr.length());
            }
        }
        return count;
    }

    /**
     * 题目4:获取两个字符串中最大相同子串。比如:
     * str1 = "abcwerthelloyuiodef";
     * str2 = "cvhellobnm"
     * 提示:将短的那个串进行长度依次递减的子串与较长的串比较。
     *
     */
    /**
     * 1.在str1找str2作为子串位置，
     * 如果找到了，返回str2长度;
     * 否则子串str为str2 [0,toindex-1]，找str1中子串位置,找到了返回该字串长度 i=1, [j,toindex+(j-i)]
     * 子串为str2 [1,toindex]，找str1中子串位置,找到了返回该字串长度;
     * 2.如果找不到,子串为str2 [0,toindex-2]，找str1中子串位置,找到了返回该字串长度;
     * 子串为str2 [1,toindex-1]，找str1中子串位置,找到了返回该字串长度;
     * 子串为str2 [2,toindex]，找str1中子串位置,找到了返回该字串长度;
     * 3.如果找不到,子串str为str2 [0,toindex-3]，找str1中子串位置,找到了返回该字串长度;
     *      * 子串为str2 [1,toindex-2]，找str1中子串位置,找到了返回该字串长度;
     *      * 子串为str2 [2,toindex-1]，找str1中子串位置,找到了返回该字串长度;
     *      子串为str2 [3,toindex]，找str1中子串位置,找到了返回该字串长度;
     *      ....
     * 4.当子串长度>=1时执行以上
     */
    public String getMaxSameSubString1(String str1, String str2) {
        String maxStr = (str1.length() > str2.length())? str1:str2;
        String minStr = (str1.length() > str2.length())? str2:str1;

        int len = minStr.length();
        for(int i = 0; i < len; i++){
            for (int x = 0, y = len - i; y <= len ; x++, y++) {
                if(maxStr.contains(minStr.substring(x, y))){
                    return minStr.substring(x, y);
                }
            }
        }

        return null;
    }
    public String[] getMaxSubString(String str1,String str2){
        String[] a = new String[20];
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            a[i] = "";
        }

        boolean isFlag = false;
        String substr = str2;
        int toIndex = substr.length() - 1;
        for (int i = 0; substr.length() >= 1 ; i++) {
            for (int j = 0; j < i + 1; j++) {
                substr = str2.substring(j, toIndex + j - i + 1);
                if(str1.contains(substr)){
                    a[count] = substr;
                    count++;
                    isFlag = true;
                }
            }
            if(isFlag){
                break;
            }
        }
        return a;
    }

    //如果只存在一个最大长度的相同子串
    public String getMaxSameSubString(String str1, String str2) {
        if (str1 != null && str2 != null) {
            String maxStr = (str1.length() > str2.length()) ? str1 : str2;
            String minStr = (str1.length() > str2.length()) ? str2 : str1;

            int len = minStr.length();
            for (int i = 0; i < len; i++) {// 0 123 4 此层循环决定要去几个字符

                for (int x = 0, y = len - i; y <= len; x++, y++) {

                    if (maxStr.contains(minStr.substring(x, y))) {

                        return minStr.substring(x, y);

                    }

                }
            }
        }
        return null;
    }

    @Test
    public void test4(){
        String s1 = "abcwerthelloyuiodellobf";
        String s2 = "cvhellobnm";
//        System.out.println(getMaxSubString(s1, s2));
//        System.out.println(getMaxSubString(s2, s1));
        String[] maxSubString = getMaxSubString(s1, s2);
        for (int i = 0; i < maxSubString.length; i++) {
            if(maxSubString[i].equals(""))
                break;
            System.out.println(maxSubString[i]);
        }

        maxSubString = getMaxSubString(s2, s1);
        for (int i = 0; i < maxSubString.length; i++) {
            if(maxSubString[i].equals(""))
                break;
            System.out.println(maxSubString[i]);
        }

        System.out.println(getMaxSameSubString1(s1, s2));
    }


     /**
     * 题目5:对字符串中字符进行自然顺序排序。
     * 提示:
     * 1)字符串变成字符数组。
     * 2)对数组排序,选择,冒泡,Arrays.sort();
     * 3)将排序后的数组变成字符串。
     */
     //题目5
     @Test
     public void testSort() {
         String str = "abcwerthelloyuiodef";
         char[] arr = str.toCharArray();
         Arrays.sort(arr);

         String newStr = new String(arr);
         System.out.println(newStr);

     }
}
