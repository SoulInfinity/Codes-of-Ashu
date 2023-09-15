class Animal {
     void show() {
        System.out.println("This is an animal.");
    }
}

class Man extends Animal {
     String name;

     Man(String name) {
        this.name = name;
    }

     Man(String name, int age) {
        this.name = name;
    }

    
     void show() {
        System.out.println("This is a man named " + name);
    }
}

class Dog extends Animal {
    private String name;

     Dog(String name) {
        this.name = name;
    }

     Dog(String name, int age) {
        this.name = name;
    }

    
     void show() {
        System.out.println("This is a dog named " + name);
    }
}

class Elephant extends Animal {
    private String name;

     Elephant(String name) {
        this.name = name;
    }

     Elephant(String name, int age) {
        this.name = name;
    }

     void show() {
        System.out.println("This is an elephant named " + name);
    }
}

class Rabbit extends Animal {
     String name;

     Rabbit(String name) {
        this.name = name;
    }

    public Rabbit(String name, int age) {
        this.name = name;
    }

    
    public void show() {
        System.out.println("This is a rabbit named " + name);
    }
}

 class Main1 {
    public static void main(String[] args) {
        Animal a = new Animal();
        Man m = new Man("John");
        Dog d = new Dog("Buddy");
        Elephant e = new Elephant("Dumbo");
        Rabbit r = new Rabbit("Fluffy");

        a.show();
        m.show();
        d.show();
        e.show();
        r.show();
    }
}
