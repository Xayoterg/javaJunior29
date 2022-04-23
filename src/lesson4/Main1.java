package lesson4;

import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        System.out.println("выберите фигуру:");
        System.out.println("1-квадрат");
        System.out.println("2-круг");
        System.out.println("3-овал");
        System.out.println("4-прямоугольник");
        System.out.println("5-треугольник");
        Scanner scanner = new Scanner(System.in);
        String figura = scanner.nextLine();
        //оператор==используются только к примитивном типам!!!
        //equals сравнивает равенство!!!
        if (figura.equals("1") || figura.equalsIgnoreCase("квадрат")) {


            System.out.println("Площадь или периметр");
            String action = scanner.nextLine();

            System.out.println("Введите сторону квадрата");
            String storona = scanner.nextLine();

            int a = Integer.parseInt(storona);
            if (action.equalsIgnoreCase("Площадь")) {
                System.out.println("Площадь квадрата=" + (a * a));
            } else {
                System.out.println("Периметр квадрата=" + (a * 4));

            }
        } else if (figura.equals("2") || figura.equalsIgnoreCase("круг")) {

            System.out.println("Введите радиус");

            double radius = scanner.nextDouble();
            double area = Math.PI * (radius * radius);

            System.out.println("площадь круга равна" + area);
            double circaumference = Math.PI * 2 * radius;
            System.out.println("длина окружности равна" + circaumference);


        } else if (figura.equals("3") || figura.equalsIgnoreCase("овал")) {

            System.out.println("Введите растояние до оси Y:");
            double oval = scanner.nextDouble();

            System.out.println("Введите растояние до оси X:");
            double ellipse = scanner.nextDouble();

            double area = Math.PI * oval * ellipse;
            System.out.printf("площадь элепса состовляет %2f", area);

        } else if (figura.equals("4") || figura.equalsIgnoreCase("прямоугольник")) {
            System.out.println("Площадь или длина");
            String shirina = scanner.nextLine();

            System.out.println("Введите сторону прямоугольника");
            String dlina = scanner.nextLine();

            int b = Integer.parseInt(dlina);
            if (shirina.equalsIgnoreCase("Площадь")) {
                System.out.println("Площадь прямоугольника=" + (b * b));
            } else {
                System.out.println("длина прямоугольника=" + (b*4));

            }

            } else if (figura.equals("5") || figura.equalsIgnoreCase("треугольник")) {
            System.out.println("Площадь или периметр");
            String action = scanner.nextLine();

            System.out.println("Введите сторону треугольника");
            String storona = scanner.nextLine();

            int c = Integer.parseInt(storona);
            if (action.equalsIgnoreCase("Площадь")) {
                System.out.println("Площадь треугольника=" + (c * c));
            } else {
                System.out.println("Периметр треугольника=" + (c * 3));

            }


                }
            }
        }

