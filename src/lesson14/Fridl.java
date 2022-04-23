package lesson14;

import java.util.HashMap;

public class Fridl {
    private HashMap<String, Integer> product = new HashMap<>();

    public void putProduct(String pr, int valeu) {
        if (product.containsKey(pr)) {
            product.put(pr, valeu + product.get(pr));

        } else {
            product.put(pr, valeu);
        }
    }
    public void printAllProduct(){
        for (String pr:product.keySet()){
            System.out.println(pr+"-"+product.get(pr));
        }
    }
    public void getProduct(String pr,int value) {
        if (!product.containsKey(pr)) {
            System.out.println("такого продук нет" + pr);
            return;
        }
        if (product.get(pr) < value) {
            System.out.println("мы взяли " + product.get(pr) + "кг" + pr);
            product.remove(pr);
            return;
        }
        product.put(pr, product.get(pr) - value);
        System.out.println("Все взяли " + pr + " ," + value);
    }
}
