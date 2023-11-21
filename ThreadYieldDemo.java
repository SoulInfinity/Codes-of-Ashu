public class ThreadYieldDemo extends Thread{
    public void run()
{
    for(int i = 0; i<9 ; i++)
    {
        System.out.println(Thread.currentThread().getName()+"  - "+i+"In class ");
    }
    
}
public static void main(String[] args) {
    ThreadYieldDemo th = new ThreadYieldDemo();
    th.start();
    Thread.yield();//if you want main method to stop and provide chance to other thread
    for(int i = 0 ; i< 9 ; i++){
        System.out.println(Thread.currentThread().getName()+"  -  "+i+"In main method");
    } 
}

}
