package homework;

public class Main3 {

    public static void main(String[] args) {
        int even = 0;
        int noteven = 0;
        for (int i = 1; i <= 11; i = i++) {

            if (i % 2 == 0) {
                even++;
            } else {
                noteven++;
            }
        }
        if (even > noteven) {
            System.out.println("четных больше=" + even);
        } else if (even < noteven)
            System.out.println("не четных больше" + noteven);
        else {
            System.out.println("поровну четных и не четных" + noteven);
        }
        System.out.println("конец 5-ого задания");
        {
        }
    }
}
