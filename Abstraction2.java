abstract class Animal
{
    abstract void getsound();
    public void display()
    {
        System.out.println("user se kuch chupa rahe he guysss");
    }
}
class Dog extends Animal
{
    public void getsound(){
        System.out.println("Barking...bhow bhow....");
    }
}
public class Abstraction2 {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.getsound();  
        d.display(); 
    }
}
