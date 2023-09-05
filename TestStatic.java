import java.io.*;
class Student
{
     int roll;
    String name;
    static String College = "GIET";
    Student(int r,String s)
    {
        roll = r;
        name = s;
    }
    void display()
    {
        System.out.println(roll+" "+name);
    }
}
public class TestStatic {
   public static void main(String[] args)throws IOException{
    InputStreamReader r = new InputStreamReader(System.in);
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Enter roll number: ");
    int r1 = Integer.parseInt(br.readLine());
    System.out.println("Enter the name: ");
    String s1 = br.readLine();
    Student s3 = new Student(r1,s1);
        System.out.println("Enter roll number for another student: ");
            int r2 = Integer.parseInt(br.readLine());
        System.out.println("Enter the name: ");
    String s2 = br.readLine();
    Student s4 = new Student(r2,s2);
    s3.display();
     s4.display();
     r.close();
   }
}
