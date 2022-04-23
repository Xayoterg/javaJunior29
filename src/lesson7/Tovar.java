package lesson7;

public class Tovar {
    private String name;
    private int prays;
    private Proizvoditel proizvoditel;
    private Otziv[]otzivs=new Otziv[100];

    public Tovar() {
    }

    public Tovar(String name, int prays) {
        this.name = name;
        this.prays = prays;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrays() {
        return prays;
    }

    public void setPrays(int prays) {
        this.prays = prays;
    }

    public Proizvoditel getProizvoditel() {
        return proizvoditel;
    }

    public void setProizvoditel(Proizvoditel proizvoditel) {
        this.proizvoditel = proizvoditel;
    }

    public Otziv[] getOtzivs() {
        return otzivs;
    }

    public void setOtzivs(Otziv[] otzivs) {
        this.otzivs = otzivs;
    }

  public void addOtzivToTovar(Otziv otziv){
        for (int i=0;i< otzivs.length;i++){
            if (otzivs[i]==null){
                otzivs[i]=otziv;
                break;
            }
        }

    }

}
