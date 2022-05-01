package lesson18;

public class Main {
    public static void main(String[] args) {
        SecondTread secondTread=new SecondTread();
        secondTread.start();

        Thread myTread=new Thread(new MyTread());
        myTread.start();

        for (int i=0;i<10;i++){
            System.out.println(i+"---"+Thread.currentThread().getName());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

