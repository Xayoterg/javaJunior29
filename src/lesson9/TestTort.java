package lesson9;

public class TestTort {
    public static void main(String[] args) {
        Baking baking=new Tort();
        System.out.println(baking.getDescription()+"его цена"+baking.getPrice());

       baking = new Crem(baking);


        System.out.println(baking.getPrice()+"его цена"+baking.getPrice());
        baking=new Chocolate(baking);

    }
}
