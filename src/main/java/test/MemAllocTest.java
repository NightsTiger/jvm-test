package test;

/**
 * @author : dingwenqiang
 * @date : 2019/11/29 13:42
 * @description :
 * -Xmx20M
 * -Xms20M
 * -Xmn10M
 * -XX:+PrintGCDetails
 * -Xloggc:gc.log
 */
public class MemAllocTest {

    private int[] data ;

    public MemAllocTest(int[] data) {
        this.data = data;
    }

    public static void main(String[] args) {

        MemAllocTest memAllocTest0 = new MemAllocTest(new int[2 * 1024 * 1024]);
        MemAllocTest memAllocTest1 = new MemAllocTest(new int[2 * 1024 * 1024]);
        MemAllocTest memAllocTest2 = new MemAllocTest(new int[2 * 1024 * 1024]);
        MemAllocTest memAllocTest3 = new MemAllocTest(new int[4 * 1024 * 1024]);

        System.gc();

    }


}
