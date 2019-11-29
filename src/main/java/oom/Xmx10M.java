package oom;

import java.util.ArrayList;
import java.util.List;

/**
 * @author : dingwenqiang
 * @date : 2019/11/26 19:55
 * -verbose:gc
 * -Xms10M
 * -oom.Xmx10M
 * -Xmn10M
 * -XX:+PrintGCDetails
 * -XX:SurvivorRatio=8
 */
public class Xmx10M {
    static class OOMObject {

    }

    public static void main(String[] args) {
        List<OOMObject> list = new ArrayList<OOMObject>();
        while (true) {
            list.add(new OOMObject());
        }
    }
}
