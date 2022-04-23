package lesson2;

public class Main2 {
    public static void main(String[] args) {
        int mark = 4;
        switch (mark) {
            case 5:
                System.out.println("отлично");
                break;
            case 4:
                System.out.println("хорошо");
                break;
            case 3:
                System.out.println("плохо");
                break;
            case 2:
                System.out.println("очень плохо");
                break;
            default:
                System.out.println("это не оценка");
        }
    }
}
