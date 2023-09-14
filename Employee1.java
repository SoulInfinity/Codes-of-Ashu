import java.util.Scanner;
class Employee {
    private int id;
    private String name;
    private String department;
    private double salary;

    Employee() {
    }

     Employee(int id, String name, String department, double salary) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Employee ID: ");
        this.id = sc.nextInt();
        sc.nextLine(); 
        System.out.print("Enter Employee Name: ");
        this.name = sc.nextLine();
        System.out.print("Enter Employee Department: ");
        this.department = sc.nextLine();
        System.out.print("Enter Employee Salary: ");
        this.salary = sc.nextDouble();
    }

        void display() {
        System.out.println("Employee ID: " + id);
        System.out.println("Employee Name: " + name);
        System.out.println("Employee Department: " + department);
        System.out.println("Employee Salary: " + salary);
    }

     double getSalary() {
        return salary;
    }
}

class Manager extends Employee {
    private double bonus;

     Manager() {

     }
     Manager(int id, String name, String department, double salary, double bonus) {
        super(id, name, department, salary);
        this.bonus = bonus;
    }
     void input() {
        super.input();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Manager Bonus: ");
        this.bonus = sc.nextDouble();
    }
     void display() {
        super.display();
        System.out.println("Manager Bonus: " + bonus);
    }

     double getTotalSalary() {
        return getSalary() + bonus;
    }
}
public class Employee1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of managers: ");
        int n = sc.nextInt();
        Manager[] m = new Manager[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter details for Manager " + (i + 1) + ":");
            m[i] = new Manager();
            m[i].input();
        }
        Manager maxSalaryManager = m[0];
        for (int i = 1; i < n; i++) {
            if (m[i].getTotalSalary() > maxSalaryManager.getTotalSalary()) {
                maxSalaryManager = m[i];
            }
        }
        System.out.println("Manager with Maximum Total Salary:");
        maxSalaryManager.display();
    }
}
