package Experiment8;
import java.util.Scanner;
class Student {
    int roll;
    int[] marks = new int[3];
     Student(int roll) {
        this.roll = roll;
    }
     double calculateAverage() {
        int sum = 0;
        for (int mark : marks) {
            sum += mark;
        }
        return (double)sum/marks.length;
    }
}
public class Q2
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student[] s = new Student[8];
        for (int i = 0; i < s.length; i++) {
            System.out.print("Enter roll number for student " + (i + 1) + ": ");
            int roll = sc.nextInt();
            s[i] = new Student(roll);
            System.out.println("Enter marks for three subjects (out of 10) for student " + (i + 1) + ":");
            for (int j = 0; j < 3; j++)
             {
                System.out.print("Subject " + (j + 1) + ": ");
                s[i].marks[j] = sc.nextInt();
            }
        }
        System.out.println("\nRoll Number\tAverage Marks");
        for (Student s1 : s) {
            double average = s1.calculateAverage();
            System.out.println(s1.roll + "                " + average);
        }
    }
}
