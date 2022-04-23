package lesson9;

public class Chocolate extends Dobafka{
    public Chocolate(Baking baking) {
        super(baking);
    }

    @Override
    public long getPrice() {
        return 30+baking.getPrice();
    }

    @Override
    public String getDescription() {
        return "с шоколадам";
    }
}
