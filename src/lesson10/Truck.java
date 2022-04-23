package lesson10;

public class Truck extends Bus {
    private double Current_Load;
    private double Max_Load;

    public Truck() {

    }

    public Truck(double load, double max_load, double petrol, double max_petrol) {
        super();
        this.Current_Load = load;
        this.Max_Load = max_load;

    }

    public double getCurrent_Load() {
        return Current_Load;
    }

    public double getMax_Load() {
        return Max_Load;
    }


    @Override
    public void arrive() {
        super.arrive();
        Base.goods_on_base = Base.goods_on_base - Current_Load;
    }

    @Override
    public boolean leave() {

        if (Base.goods_on_base < 1) {
            return false;
        }


        double need_petrol =  getPetrol_amount()-getTank_volume();
        if (need_petrol > Base.petrol_on_base) {
            return false;
        }
        Base.goods_on_base--;
        Base.goods_on_base = Base.goods_on_base -Max_Load;
        double needGoods=Current_Load;
        if (Base.goods_on_base>=needGoods){
            Base.goods_on_base=Base.goods_on_base-needGoods;
        return true;

    } else {
            Base.goods_on_base=0;
        }
        return true;

    }
}