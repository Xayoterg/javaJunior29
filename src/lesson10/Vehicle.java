package lesson10;

public class Vehicle {

    private double tank_volume;
    private double petrol_amount;

    public Vehicle(){

    }

    public double getTank_volume() {
        return tank_volume;
    }

    public double getPetrol_amount() {
        return petrol_amount;
    }

    public Vehicle(double tank_volume, double petrol_amount) {
        this.tank_volume = tank_volume;
        this.petrol_amount = petrol_amount;

    }

    public void arrive() {
        Base.people_on_base++;
        Base.vehicles_on_base++;
        Base.goods_on_base++;
    }

    public boolean leave() {
        if (Base.people_on_base < 1) {
            return false;
        }
        if (Base.vehicles_on_base < 1) {
            return false;
        }
        double need_petrol =  petrol_amount-tank_volume;
        if (need_petrol > Base.petrol_on_base) {
            return false;
        }
        Base.people_on_base--;
        Base.vehicles_on_base--;
        Base.goods_on_base--;
        Base.petrol_on_base = Base.petrol_on_base - petrol_amount;
        return true;

    }
}