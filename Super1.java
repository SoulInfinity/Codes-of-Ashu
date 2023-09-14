public class Super1 {
    public static void main(String[] args) {
        Car v1 = new Car();
        v1.display();    
}
}
class Vehicle
{
    int speed = 120;
}
class Car extends Vehicle{
    int speed = 180;
    void display()
    {
        System.out.println("The parent class invoke by using super method is demonstrated here: "+super.speed);
        System.out.println("without invoke the value of the variable is:"+speed);
    }
}

