
class UserThread extends Thread{
    public void run()
    {
        //Tasks....
        System.out.println("This is user defined thread");
    }
}
public class ThreadOp {
    public static void main(String[] args) {
        System.out.println("Program started..");
        int x = 23+67;
        System.out.println("Sum is "+x);
        //Thread...
         Thread t = Thread.currentThread();
         String tname = t.getName();
         System.out.println("Current running thread is "+tname);
         t.setName("My main");
         System.out.println(t.getName());
         try{
            Thread.sleep(1000,1);
         }
         catch(InterruptedException e){

         };
         System.out.println(t.getId());
         //going to start user defined thread
        System.out.println("Program ended...");
        UserThread thr = new UserThread();
        thr.start();
    }
}
