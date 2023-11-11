package Operation;

public class Fibonacci
{
    public void Fibo(int p)
    {
        int a,b,c;
        a=0;
        b=1;
        System.out.print(a+" ");
        System.out.print(b+" ");
        for(int i=2;i<=p;i++)
        {
           c=a+b;
           System.out.print(c+" ");
           a=b;
           b=c;
        }
     }
}
