package lesson19;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {


        Set<String> hashSet = new HashSet<>();
        hashSet.add("java");
        hashSet.add("go");
        hashSet.add("c++");

        Set<String> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add("java");
        linkedHashSet.add("go");
        linkedHashSet.add("c++");

        Set<String> treeSet = new TreeSet<>();
        treeSet.add("java");
        treeSet.add("go");
        treeSet.add("c++");

        for (String s : hashSet) {
            System.out.println("hashSet "+s);
        }

        for (String s :linkedHashSet) {
            System.out.println("linkedHashSet "+s);
        }

        for (String s :treeSet){
            System.out.println("treeSet "+s);
        }

//
//        ArrayList<String> arrayList = new ArrayList<>();
//        arrayList.add("java");
//        arrayList.add("c++");
//        arrayList.add("go");
//        arrayList.add("c#");
//        arrayList.add("python");
//        System.out.println(arrayList);

//        int [] a = new int[5];
//        int [] b = {0,1,2,3,4,5,6};
//
//        a[0]= 0;
//        a[1]= 1;
//        a[2]= 2;
//        a[3]= 3;
//        a[4]= 4;

//        for (int i =0;i<a.length;i++){
//            System.out.println(a[i]);
//        }

//        for (int i =0;i<b.length;i++){
//            System.out.println(b[i]);
//        }

//        System.out.println(b[7]);

    }
}
