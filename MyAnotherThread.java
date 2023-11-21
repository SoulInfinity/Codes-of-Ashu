public class MyAnotherThread extends Thread {
    public void run()
    {
        //task for thread
        for(int i=10;i>=1;i--)
        {
            System.out.println("Another thread ="+i);
        }
        /*try{
            Thread.sleep(5000);
        }catch(Exception e)
        {
            System.out.println(e);
        }*/
    }
    public static void main(String[] args) {
        MyThread th = new MyThread();
        Thread t = new Thread(th);
        //Object of another thread
        MyAnotherThread thr = new MyAnotherThread();
        thr.start();
        t.start();
    }
}

