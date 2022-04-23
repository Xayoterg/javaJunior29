package lesson13;

import java.util.HashSet;
import java.util.TreeSet;

public class Main1 {
    public static void main(String[] args) {
        Coin coin1 = new Coin(1800, 5, 2.5, "золота");
        Coin coin2 = new Coin(1800, 5, 2.5, "золота");
        Coin coin3 = new Coin(2300, 3, 3.5, "серебро");
        Coin coin4 = new Coin(3800, 54, 5.5, "олово");
        Coin coin5 = new Coin(1800, 2, 6.5, "алмаз");
        TreeSet<Coin> coins = new TreeSet<>();
        coins.add(coin1);
        coins.add(coin2);
        coins.add(coin3);
        coins.add(coin4);
        coins.add(coin5);
      //  for (Coin coin : coins) {
        //    System.out.println(coin);
        CoinSort.printCoinByNominal(coins);
    }
}