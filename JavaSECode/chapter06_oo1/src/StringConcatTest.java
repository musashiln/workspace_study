/**
 * ClassName: StringConcatTest
 * Package: PACKAGE_NAME
 * Description:
 *
 * @Author gxy
 * @Create 2025/3/13 21:18
 * @Version 1.0
 */
public class StringConcatTest {

    public static void main(String[] args) {
        StringConcatTest stringConcatTest = new StringConcatTest();
        String info = stringConcatTest.concat("-","hello","world");
        System.out.println(info);
        System.out.println(stringConcatTest.concat(","));
        System.out.println(stringConcatTest.concat(".", "hello"));


    }

    public String concat(String operator, String ... strs) {
        String result = "";

        for(int i = 0; i < strs.length; i++){
            if(i == 0){
                result += strs[i];
            }else{
                result += operator + strs[i];
            }
        }
        return result;

    }
}
