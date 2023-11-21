package Multithreading;

public class Runnable_ implements Runnable{
    @Override
    public void run()
    {
        System.out.println("Thread through runnable Interface");
    }
    public static void main(String[] args) {
        Runnable_ r1 = new Runnable_();
        Thread th = new Thread(r1);
        th.start();
    }
}
