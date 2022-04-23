package Lesson15;

import java.util.TreeMap;

public class TreeMapEx {
    public static void main(String[] args) {
        Student student=new Student(1,"Ivan",4);
        TreeMap<String,Integer>treeMap=new TreeMap<>();
        treeMap.put("Hello",1);
        treeMap.put("Word",5);
        treeMap.put("Kshfu",6);
        treeMap.put("HKhs",3);
        System.out.println(treeMap);


    }
}
