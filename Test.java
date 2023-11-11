import Operation.*;
import Operation.Successful.Armstrong;
public class Test
{
   public static void main(String args[])
   {
      Fibonacci f=new Fibonacci();
      f.Fibo(10);
      Armstrong a=new Armstrong();
      a.Check(152);
   }
}