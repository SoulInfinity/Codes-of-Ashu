import java.util.Scanner;

class Person { 
    String name;
    int age;
    String gender;

    Person() {  //2.Constructor without Argument as parameter
        this.name = "Ashutosh";
        this.age = 20;
        this.gender = "Male";
    }

    Person(String name, int age, String gender) {  //2.Constructor with Argument as parameter
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

     Person(Person otherPerson) {   //3.Object with parameter to create a new copy
        this.name = otherPerson.name;
        this.age = otherPerson.age;
        this.gender = otherPerson.gender;
    }

     void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Gender: " + gender);
    }
}

public class EX4_Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Person person1 = new Person();
        System.out.println("Person 1:\n");
        person1.displayDetails();
        System.out.print("Enter name: ");
        String name = sc.nextLine();
        System.out.print("Enter age: ");
        int age = sc.nextInt();
        System.out.print("Enter gender: ");
        String gender = sc.nextLine();
        Person person2 = new Person(name, age, gender);
        System.out.println("Person 2:");
        person2.displayDetails();
        Person person3 = new Person(person2);
        System.out.println("Person 3 (Copy of Person 2):");
        person3.displayDetails();
        sc.close();
    }
}
