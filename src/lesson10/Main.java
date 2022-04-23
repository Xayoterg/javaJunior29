package lesson10;

public class Main {
    public static void main(String[] args) {

        Truck t=new Truck(4,30,43,56);



        System.out.println(t.getMax_Load());
        System.out.println(t.getCurrent_Load());
        System.out.println(t.getPetrol_amount());
        System.out.println(t.getTank_volume());


        System.out.println();

// init
        Base.vehicles_on_base = 49;
        Base.people_on_base = 99;
        Base.petrol_on_base = 1000.0;
        Base.goods_on_base  = 2000.0;

        System.out.println("Initially:");
        System.out.println( Base.vehicles_on_base );
        System.out.println( Base.people_on_base );
        System.out.println( Base.petrol_on_base );
        System.out.println( Base.goods_on_base );
        System.out.println();

// arrive
        t.arrive();
        System.out.println( "Arrived:" );

        System.out.println( Base.vehicles_on_base );	// arrived
        System.out.println( Base.people_on_base );

        System.out.println( Base.petrol_on_base );	// same
        System.out.println( Base.goods_on_base );
        System.out.println();

// leave
        t.leave();
        System.out.println( "Left:" );

        System.out.println( Base.vehicles_on_base );	// left
        System.out.println(Base.people_on_base );

// should be 1000-(60-19.5)
        System.out.println(Base.petrol_on_base );	// changed!

        System.out.println(Base.goods_on_base );	// same
        System.out.println();
    }
}
