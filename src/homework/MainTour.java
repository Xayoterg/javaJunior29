package homework;


public class MainTour {


    public static void TourCounryBy(String[][] country, String TourtoTrip) {
        for (int i = 0; i < country.length; i++) {
            if (TourtoTrip.equalsIgnoreCase(country[i][0])) {

                System.out.printf("%s %s %s %s %s \n", country[i][0], country[i][1], country[i][2], country[i][3], country[i][4]);
            }
        }
    }
}








