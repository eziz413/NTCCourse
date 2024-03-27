package lesson21;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapMain {

    public static void chap(Map<Integer,String> map){
        map.put(3,"C#");
        map.put(1,"Python");
        map.put(2,"Go");
        map.put(4,"C++");
        map.put(5,"Java");

//        for (Map.Entry<Integer,String> entry :map.entrySet()) {
//            System.out.println(entry);
//        }

        System.out.println(map.keySet());
        System.out.println(map.values());
    }

    public static void main(String[] args) {

//        HashMap<Integer, String> hashMap = new HashMap<>();
//        hashMap.put(10, "Test1");
//        hashMap.put(14, "Test2");
//        hashMap.put(15, "test3");
//        hashMap.put(17, "test4");

//        System.out.println(hashMap);
//
//        System.out.println(hashMap.get(10));
//        System.out.println(hashMap.get(17));

//        for (Map.Entry<Integer, String> entry : hashMap.entrySet()) {
//            System.out.println(entry);
//        }

        Map<Integer,String> hashMap= new HashMap<>();
        Map<Integer,String> linkedHashMap= new LinkedHashMap<>();
        Map<Integer,String> treeMap= new TreeMap<>();

        chap(hashMap);

        System.out.println("*******************");
        chap(linkedHashMap);

        System.out.println("*******************");

        chap(treeMap);

        System.out.println("*******************");

    }
}
