package lesson2;

public class Main7 {
    public static void main(String[] args) {
        int maney = 100000;
        int years = 5;
        int prosent = 18;
        for (int month = 0; month < years * 12; month++) {
            maney = maney + ((maney / 100 * prosent) / 12);
            System.out.println(maney);
        }
    }
}