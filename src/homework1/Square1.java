package homework1;

import java.util.Objects;

public class Square1 extends Material{

    private int a;

    public Square1() {
    }

    public Square1(int a) {
        this.a = a;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }
    public int ploshad(){
        return this. a* this. a;
    }
    public int perimetr(){return this.a*4;}

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Square1 square1 = (Square1) o;
        return a == square1.a;
    }

    @Override
    public int hashCode() {
        return Objects.hash(a);
    }
}
