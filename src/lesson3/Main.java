package lesson3;

public class Main {
    public static void main(String[] args) {
        int[] numbers = new int[10];

//        numbers[0] = 10;
//        numbers[1] = 12;
//        numbers[2] = 14;
//        numbers[3] = 16;
//        numbers[4] = 18;
//        numbers[5] = 20;
//        numbers[6] = 22;
//        numbers[7] = 24;
//        numbers[8] = 26;
//        numbers[9] = 28;
        int valeu = 10;
        for (int i = 0; i < 10; i++) { //можно также в место 10 поставить number.length
            numbers[i] = valeu;
            valeu = valeu + 2;
        }
        for (int i = 0; i < 10; i++) { //здесь также и место 10 number.length значение не изменется
            System.out.println(numbers[i]);
        }

    }
}