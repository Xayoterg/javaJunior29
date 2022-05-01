package lesson14;

import java.util.HashMap;

public class Recept {
    private String name;
    private int amount;
    private HashMap<String,Integer>ingridients=new HashMap<>();


    public Recept(String name, int amount) {
        this.name = name;
        this.amount = amount;
    }

    public String getName() {
        return name;
    }

    public int getAmount() {
        return amount;
    }

    public HashMap<String, Integer> getIngridients() {
        return ingridients;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public void setIngridients(HashMap<String, Integer> ingridients) {
        this.ingridients = ingridients;
    }
}


