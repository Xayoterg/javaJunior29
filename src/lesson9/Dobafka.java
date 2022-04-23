package lesson9;

public abstract class Dobafka implements Baking{
    Baking baking;

    public Dobafka(Baking baking) {
        this.baking=baking;
        System.out.println(baking.getPrice()+"его цена"+baking.getPrice());
    }
}
