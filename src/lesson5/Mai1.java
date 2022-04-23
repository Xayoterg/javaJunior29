package lesson5;

import java.util.Scanner;

public class Mai1 {
    public static void main(String[] args) {
        String[][]tours={{"Италия","40000","7дней","самолет","4звезды"},
                {"Италия","40000","6дней","самолет","3звезды"},
                {"Франция","660000","8дней","самолет","4звезды"},
                {"Венгрия","320000","9дней","самолет","3звезды"},
                {"Прага","20000","7дней","самолет","3звезды"},
                {"Швеция","50000","7дней","самолет","5звезды"}};
        Scanner scanner=new Scanner(System.in);
        System.out.println("на какой бюджет расчитываете");
        String moneyToTrip=scanner.nextLine();
        ToursUtils.prinToursByMoney(tours,moneyToTrip);
        ToursUtils.printAverageCost(tours);
    }
}
