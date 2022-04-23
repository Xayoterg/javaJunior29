package Lesson15;

import java.util.ArrayList;
import java.util.List;

public class Parametritez {
    public static void main(String[] args) {
        Example<Integer,Double> stringExample = new Example<>();
        List<String>strings=new ArrayList<>();
        strings.add("Hello");
        strings.add("Hello");
        strings.add("Hello");
        stringExample.printElementCollection(strings);
    }
}

class Example<T,E> {
    T value;
    E value1;

    public void showValue() {
        System.out.println(value);
        System.out.println(value1);
    }
    public <V> void printElementCollection(List<V>values){

        for (V v : values) {
            System.out.println(v);

        }
    }
}