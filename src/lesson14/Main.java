package lesson14;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        HashMap<String,Integer> tablo=new HashMap<>();
        tablo.put("динамо",23);
        tablo.put("ЦСК",15);
        tablo.put("Спартак",38);
        tablo.put("динамо",10+tablo.get("динамо"));
     //   System.out.println(tablo);
        for (String comanda:tablo.keySet()){//проход по map(с помощью keySet)
            System.out.println(comanda+"-"+tablo.get(comanda));
        }
        for (Map.Entry<String,Integer>para:tablo.entrySet()){
            System.out.println(para.getKey()+"-"+para.getValue());
        }
    }
}
