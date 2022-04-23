package homework1;

import java.util.Objects;

public class Oval extends Circle {

    private double radius;

    @Override
    public double getRadius() {
        return radius;
    }

    @Override
    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double area(){return this.radius* Math.PI*radius;}

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Oval oval = (Oval) o;
        return Double.compare(oval.radius, radius) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), radius);
    }

    @Override
    public String toString() {
        return "Oval{" +
                "radius=" + radius +
                '}';
    }
}
