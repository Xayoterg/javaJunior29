package lesson14;

public class Main2 {
    public static void main(String[] args) {
        Fridl fridl=new Fridl();
        fridl.putProduct("банан",2);
        fridl.putProduct("яблоко",5);
        fridl.putProduct("груша",4);
        fridl.putProduct("банан",3);
        fridl.getProduct("яблоко",3);
        fridl.printAllProduct();
    }
}
