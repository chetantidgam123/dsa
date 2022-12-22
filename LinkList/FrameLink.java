package LinkList;

import java.util.*;

public class FrameLink {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();
        list.add("Name");
        list.add("is");
        list.addFirst("My");
        list.addLast("Chetan");
        list.add(2, "MiddleAt_2");
        list.removeFirst();
        list.removeLast();
        System.out.println(list);
    }
}
