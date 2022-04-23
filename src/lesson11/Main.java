package lesson11;

public class Main {
    public static void main(String[] args) {
        Slon slon1=new Slon();
        Slon slon2=new Slon();

        Tiger tiger1=new Tiger();
        Tiger tiger2=new Tiger();

        Medved medved1=new Medved();
        Medved medved2=new Medved();

        AbstractAnimal[]animals=new AbstractAnimal[6];
        animals[0]=tiger2;
        animals[1]=tiger1;
        animals[2]=slon2;
        animals[3]=slon1;
        animals[4]=medved2;
        animals[5]=medved1;
        for (AbstractAnimal currenanimal:animals){
            currenanimal.voice();
        }
    }
}
