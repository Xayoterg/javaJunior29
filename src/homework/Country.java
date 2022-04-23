package homework;



import java.util.Scanner;

public class Country {
    public static void main(String[] args) {
        String[][] country = {{"Москва", "200000", "3 дня", "Самолет", "4 звезды"},
                {"Сочи", "100000", "3 дня", "Самолет", "4 звезды"},
                {"Владивосток", "90000", "4 дня", "Самолет", "3 звезды"},
                {"Казань", "120000", "6 дня", "Самолет", "3 звезды"},
                {"Санк-петербург", "180000", "5 дня", "Самолет", "5 звезды"}};

        Scanner scanner = new Scanner(System.in);
        System.out.println("на сколько дней расчитываете");
        String TourtoTrip = scanner.nextLine();
        CountryRash.Russia(country,TourtoTrip);

    }
}
