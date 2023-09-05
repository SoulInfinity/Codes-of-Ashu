class Area{
    int area(int x)
    {
        return x*x;
    }
    int area(int l,int b){
        return l*b;
    }
    double area(double h,double r){
        return 2*3.14*r*(h+r);
    }
}
public class MethodOverloadingArea {
    public static void main(String[] args) {
        Area obj = new Area();
        System.out.println("Area of Triangle is: "+obj.area(6));
        System.out.println("Area of Rectangle is: "+obj.area(2,5));
        System.out.println("Area of square is: "+obj.area(3.00,7.00));
    }
}
