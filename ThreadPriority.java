public class ThreadPriority extends Thread{
    public void run()
    {
        System.out.println("Inside run() method...");
    }
    public static void main(String[] args) {
        ThreadPriority t1 = new ThreadPriority();
        ThreadPriority t2 = new ThreadPriority();
        ThreadPriority t3 = new ThreadPriority();
        System.out.println("Priority of thread t1 is"+t1.getPriority());
        System.out.println("Priority of thread t2 is.."+t2.getPriority());
        System.out.println("Priority of thread t3 is..."+t3.getPriority());
        t1.setPriority(6);
        t2.setPriority(3);
        t3.setPriority(9);
        System.out.println("Priority of thread t1 is"+t1.getPriority());
        System.out.println("Priority of thread t2 is.."+t2.getPriority());
        System.out.println("Priority of thread t3 is..."+t3.getPriority());
        System.out.println("Currently executing thread "+Thread.currentThread().getName());
        System.out.println("Priority of main thread is"+Thread.currentThread().getPriority());
        Thread.currentThread().setPriority(10);
        System.out.println("Priority of main thread is"+Thread.currentThread().getPriority());
    }
}