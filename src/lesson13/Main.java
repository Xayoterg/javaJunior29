package lesson13;

import java.util.HashSet;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        HashSet <String> strings=new HashSet<>();
        strings.add("qqq");
        strings.add("www");
        strings.add("www");
        strings.add("kkk");
        strings.add("www");

       // System.out.println(strings);


       for (Iterator<String> iter=strings.iterator();iter.hasNext();){
           System.out.println(iter.next());
       }
    }
}
