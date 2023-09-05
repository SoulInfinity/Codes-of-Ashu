class Overloading{
    void sum(int x,long y){
        System.out.println(x+y);
    }
    void sum(int a,int b,int c){
        System.out.println(a+b+c);
    }
}
public class MethodOverloading {
    public static void main(String[] args) {
        Overloading s1 = new Overloading();
        //System.out.println(s1.add(30,50));
        //System.out.println(Overloading.mul(30,2));
        s1.sum(30,50);
        s1.sum(20,20,40);
    }
}
