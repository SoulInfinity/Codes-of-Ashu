public class MyThread implements Runnable {
    public void run()
    {
        //task for thread...
        for (int i =1;i<10;i++)
        {
            System.out.println("Value of i is"+i);
        }
        try{
            Thread.sleep(5000);
        }catch(Exception e)
        {
            System.out.println(e);
        }
        
    }
    public static void main(String[] args) {
        //Create object of MyThread class
        MyThread t1 = new MyThread();
        Thread th = new Thread(t1);
        th.start();
    }
}