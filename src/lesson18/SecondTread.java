package lesson18;

public class SecondTread extends Thread{

    @Override
    public void run() {
        for (int i=0;i<120;i++){
            System.out.println(i+"---"+Thread.currentThread().getName());
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
