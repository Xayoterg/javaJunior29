package homework1;

public class Material {
    public static void main(String[] args) {
        Square1 square1=new Square1(3);
        int pl= square1.ploshad();
        System.out.println(pl);
        int pr= square1.perimetr();
        System.out.println(pr);
        Rectangle1 rectangle1=new Rectangle1(5,3);
        int pl1=rectangle1.ploshad();
        System.out.println(pl1);
        int pr2=rectangle1.perimetr();
        System.out.println(pr2);
        Circle circle=new Circle(2);
        double rd=circle.area();
        System.out.println(rd);
        Oval oval=new Oval();
        double rd2=oval.area();
        System.out.println(rd2);
        System.out.println(square1.hashCode());
        System.out.println(rectangle1.hashCode());
        System.out.println(oval.hashCode());
        System.out.println(circle.hashCode());
        System.out.println(square1.equals(rectangle1));
        System.out.println(oval.equals(circle));

    }
}
