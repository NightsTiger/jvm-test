/**
 * @author : dingwenqiang
 * @date : 2019/11/26 20:45
 */
public class StringInternTest {

    public static void main(String[] args) {
        String str1 = new StringBuilder().append("计算机").append("软件").toString();

        String str2 = new StringBuilder().append("ja").append("va").toString();
        System.out.println(str1.intern() == str1);
        System.out.println(str2.intern() == str2);
    }
}
