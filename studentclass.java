import java.util.*;
public class studentclass {
    int roll; 
    String name;
    int marks[] = new int[5];
    
    void input (int r,String n)
    {
        roll =r;
        name = n;
    }
    void readmarks()
    {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i<5; i++)
        marks[i] = sc.nextInt();
    }
    
    void printStudent()
    {
        System.out.println("Roll"+roll);
        System.out.println("name"+name);
        System.out.println("Grade"+grade());
    }
    String grade()
    {  
        double total = 0,avg;
        for ( int i=0; i<5;i++)
        total+=marks[i];
        avg=total/5;
    if(avg>=60)
    return "First";
    if(avg>=50)
    return "Second";
    if(avg>=40)
    return "third";
    else
    return "Fail";
    }

public static void main(String[] args) 
{
    studentclass s1 = new studentclass();
    s1.input( 100," ashutosh");
    System.out.println("Enter 5 subject marks:");
    s1.readmarks();
    s1.printStudent();
    
}
}



