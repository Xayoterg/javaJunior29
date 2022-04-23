package lesson2;

public class Main {
    public static void main(String[] args) {
        int money = 1016;
        int pizzaCost = 230;
        int bubbleCost = 26;
        double candyCost = 2.5;

        int canBypizza = money / pizzaCost;
        int restAfterpizzaBy = money % pizzaCost;
        int canByBubble = restAfterpizzaBy / bubbleCost;
        int restAfterBubbleBy = restAfterpizzaBy % bubbleCost;

        int canByCandy = (int) (restAfterBubbleBy / candyCost);
        double totalRest = restAfterBubbleBy - (candyCost * canByCandy);

        System.out.println(" количество пицц:" + canBypizza);
        System.out.println(" количество жвачек:" + canByBubble);
        System.out.println(" количество конфет:" + canByCandy);
        System.out.println("остаток:" + totalRest);
    }
}