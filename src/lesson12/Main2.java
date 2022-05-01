package lesson12;

public class Main2 {
    public static void main(String[] args) {
        StringUtilse utils = new StringUtilse();
        System.out.println(utils.div("232", "987"));

        try {
            utils.findNumbers("fjjn5-g9/.,rk70i5о6о7л2лаj");
        } catch (CustomException e) {
            e.printStackTrace();
        }

    }

}
