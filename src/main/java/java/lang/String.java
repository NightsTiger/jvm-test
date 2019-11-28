package java.lang;

/**
 * @author : dingwenqiang
 * @date : 2019/11/28 08:27
 * @description : bootstrap ClassLoader 加载rt.jar中的String，找不到main方法
 * 双亲委派和沙箱机制
 */
public class String {

    public static void main(String[] args) {
        String myString = new String();
    }
}
