package lesson1;

public class Main {
    public static void main(String[] args) {
        int a = 5;
        int b = 4;
        int c = 7;
        //оператоы.которые возвращают
        // ответ true
        // или fals//
//> >=< <= == !=}
        if (a == b && b == c && c != a) {
            System.out.println("это равносторонний треугольник");
        }
        if (a != b && b != c && c != a) {
            System.out.println("это разносторонний треугольник");
        }

        if (a != b && b != c && c == a) {
            System.out.println("это равнобедренный треугольник");

        }

    }
}