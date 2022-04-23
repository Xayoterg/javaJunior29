package lesson5;

public class ToursUtils {
    public static void prinToursByMoney(String[][] tours, String moneyToTrip) {
        int moneyFromUser=Integer.parseInt(moneyToTrip);
        for (int i=0;i<tours.length;i++){
            String tourCostStr=tours[i][1];
            int a = Integer.parseInt(tourCostStr);
            if (Math.abs(a-moneyFromUser)<20000){
                System.out.printf("тур %s,%s, %s ,%s,\n",tours[i][1],tours[i][2],tours[i][3],tours[i][4]);

            }
        }
    }public static void printAverageCost(String[][]tours){
        int summa =0;
        for (int i=0;i<tours.length;i++){
            String tourCostStr=tours[i][1];
            int a = Integer.parseInt(tourCostStr);
            summa=summa+a;

    }
        System.out.println("средняя стоимость тура"+(summa/tours.length)+"руб");
    }
}
