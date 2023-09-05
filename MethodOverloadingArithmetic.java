class Arithmetic{
    int Operation(int x,int y){
        return x+y;
    }
    int Operation(int c)
    {
        int d=4;
        return c-d;
    }
    double Operator(double e,double f)
    {
        return e*f;
    }
    int Operator()
    {
        int g = 9,h = 4;
        return g/h;
    }
    double Operator(double i)
    {
        double j = 6.00;
        return i%j;
    }   
}
public class MethodOverloadingArithmetic {
    public static void main(String[] args) {
        Arithmetic obj = new Arithmetic();
        System.out.println("Addition is :"+obj.Operator(6,8));
        System.out.println("Substraction is:"+obj.Operator(10));
        System.out.println("Multiplication is:"+obj.Operator(3.00,10.00));
        System.out.println("Division is:"+obj.Operator());
        System.out.println("Modulous is:"+obj.Operator(28.00));
    }
}
