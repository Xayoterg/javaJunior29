package lesson9;

public class Crem extends Dobafka{
    public Crem(Baking baking) {
        super(baking);
    }

    @Override
    public long getPrice() {
        return 20+getPrice();
    }

    @Override
    public String getDescription() {
        return getDescription()+"с кремом";
    }
}
