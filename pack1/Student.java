package pack1;
  //1.	Create a user defined package “AIML-BTECH” having a class Student. In that class take two methods such as getdata() and putdata().  Take the instance variable as roll no, name and branch. Import the Student class and print the details
public class Student {
    int roll;
    String name,branch;
    public void getdata(int roll,String name,String branch)
    {
        this.roll=roll;
        this.name=name;
        this.branch=branch;
    }
    public void putdata()
    {
        System.out.println("The roll number of Student is"+ roll +"The name of the student is"+ name + "The branch of the student is"+branch);
    }
}
