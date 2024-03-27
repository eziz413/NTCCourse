package lesson19;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Performance {

    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        LinkedList<Integer> linkedList = new LinkedList<>();
        time("ArrayList", arrayList);
        time("LinkedList", linkedList);

    }

    public static void time(String dataType, List<Integer> list) {

        long start;
        long finish;

        start = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            list.add(0,i);
        }
        finish = System.currentTimeMillis();

        System.out.println(dataType + " Elave etdiyi vaxt = " + (finish - start));

    }
}
