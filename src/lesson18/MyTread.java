package lesson18;

public class MyTread implements Runnable{
    @Override
    public void run() {
        for (int i=1000;i<1020;i++){
            System.out.println(i+"---"+Thread.currentThread().getName());
            try {
                Thread.sleep(600);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
