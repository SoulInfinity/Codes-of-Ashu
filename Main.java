
class Animal {
    String name;
    
    Animal(String name) {
        this.name = name;
    }
    
    void makeSound() {
        System.out.println("Hello parent class");
    }
}

class Dog extends Animal {
    String breed;
    
    Dog(String name, String breed) {
        super(name); // Call the constructor of the superclass
        this.breed = breed;
    }
    
    void makeSound() {
        super.makeSound(); // Call the method of the superclass
        System.out.println("Hello method Makesound");
    }
    
    void displayInfo() {
        System.out.println(super.name); // Access the variable of the superclass
        System.out.println(this.breed);
    }
}
public class Main {
    public static void main(String[] args) {
        Dog myDog = new Dog("Ronaldo", "Leo");
        myDog.makeSound();
        myDog.displayInfo();
    }
}

