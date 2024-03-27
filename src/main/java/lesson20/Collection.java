package lesson20;

import java.util.Iterator;
import java.util.LinkedList;

public class Collection {

    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("Java");
        linkedList.add("Go");
        linkedList.add("C++");

        for (String s:linkedList) {
            System.out.println(s);
        }

//        Iterator<String > iterator = linkedList.listIterator();
//
//        while (iterator.hasNext()){
//            System.out.println(iterator.next());
//        }

//        for (int i =0;i<linkedList.size();i++){
//            System.out.println(linkedList.get(i));
//        }
    }
}
