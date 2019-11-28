package test.classloader;

/**
 * @author : dingwenqiang
 * @date : 2019/11/28 08:35
 */
public class ClassLoaderTest {

    public void test1() {
    }

    public void test2() {
    }

    public void test3() {
    }

    public static void main(String[] args) {
        //C++ bootstrap ClassLoader(in rt.jar)
        System.out.println(new ClassLoaderTest().getClass().getClassLoader().getParent().getParent());

        //ext ClassLoader(in .../java/ext)
        System.out.println(new ClassLoaderTest().getClass().getClassLoader().getParent());

        //AppClassLoader
        System.out.println(new ClassLoaderTest().getClass().getClassLoader());

        System.out.println("=========================");
        System.out.println(new Object().getClass().getClassLoader());

    }

}
