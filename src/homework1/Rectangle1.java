package homework1;

import java.util.Objects;

public class Rectangle1 extends Square1{

    private int a;
    private int b;

    public Rectangle1() {
    }

    public Rectangle1(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }
    public int ploshad(){
        return this. a* this. b;
    }
    public int perimetr(){
        return this.a+ this.a+this.b+this.b;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Rectangle1 that = (Rectangle1) o;
        return a == that.a && b == that.b;
    }

    @Override
    public int hashCode() {
        return Objects.hash(a, b);
    }
}
