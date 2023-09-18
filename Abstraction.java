abstract class Vehicle
{
  int tyre_no=20;
  abstract void start();
}
class Bike extends Vehicle{
    void start()
    {
        System.out.println("Bike is running");
    }
}
    class Abstraction extends Vehicle{
        void start()
        {
            System.out.println("Car is running");
        }
        public static void main(String[] args) {
            Bike b = new Bike();
            b.start();
            Abstraction a = new Abstraction();
            a.start();
        }
    }
    
