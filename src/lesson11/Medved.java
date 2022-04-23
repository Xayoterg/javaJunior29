package lesson11;

public class Medved extends AbstractAnimal{
    @Override
    public void printHave() {
        System.out.println("нет хвоста");
    }

    @Override
    public void voice() {
        System.out.println("Аааааа а");

    }
}
