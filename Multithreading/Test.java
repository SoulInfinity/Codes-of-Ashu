package Multithreading;

public class Test extends Thread{
     @Override
     public void  run()
     {
        System.out.println("Inside the thread");
        System.out.println("Thread method");
     }
     public static void main(String[] args) {
        Test t = new Test();
        t.start();
        for(int i = 0;i<5;i++)
        {
            System.out.println("Inside Main method");
        }
     }
}

