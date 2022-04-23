package homework;

public class MainHome {

    public static void main(String[] args) {

        Triangle triangle =new Triangle("труугольник",9,"a+b+c","//ht");
        triangle.setPathToImage("htm");
        Rectangle rectangle=new Rectangle("прямоугольник",14,"a+b+c+d","//htm");
        rectangle.setPathToImage("//htm");
        Square square=new Square("квадрат",12,"a+b+c+d","//thg");
        square.setPathToImage("//thg");



        System.out.println();


    }
}
