package lesson8;

public class Main {
    public static void main(String[] args) {
        Pramougolnik pramougolnik1 = new Pramougolnik(3, 5);
        Pramougolnik pramougolnik2 = new Pramougolnik(3, 5);
        int pl1 = pramougolnik1.ploshad();
        System.out.println(pl1);
        int perm = pramougolnik1.perimetr();

        System.out.println(perm);
        System.out.println(pramougolnik1.equals(pramougolnik2));

        System.out.println(pramougolnik1.hashCode());
        System.out.println(pramougolnik2.hashCode());

        System.out.println(pramougolnik1.toString());



    }
}