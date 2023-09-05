
import java.util.*;
public class Anonymousobjectfibonacci {
    public static void main(String[] args) {
        new fibonacci().fibo(5);
    }
}
class fibonacci{
    Scanner sc = new Scanner(System.in);
    void fibo(int term)
    {
        int a=0,b=1;
        for(int i=0;i<term;i++){
           int c = a+b;
           System.out.println(c+" ");
           b=c;
           a=b;
        }
    }
}
