package homework;

public class CountryRash {
    public static void Russia(String[][] country, String TourtoTrip) {

        for (int i = 0; i < country.length; i++) {
            if (country[2].length<i)
            if (TourtoTrip.equalsIgnoreCase(country[i][2])) {

                System.out.printf("тур %s,%s, %s ,%s,\n", country[i][0], country[i][1], country[i][2], country[i][3]);

            }
        }
    }
}



