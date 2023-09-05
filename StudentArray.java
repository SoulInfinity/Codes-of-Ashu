class Array {
    int roll_no;
    String name;
    char section;

    Array(int r, String n, char s)
     {
        roll_no = r;
        name = n;
        section = s;
    }

    void display()
     {
        System.out.println("Roll number: " + roll_no);
        System.out.println("Name is:" + name);
        System.out.println("Section is:" + section);
    }
}

public class StudentArray {
    public static void main(String[] args) {
        Array obj[] = new Array[5];
        obj[0] = new Array(1, "Ashutosh", 'A');
        obj[1] = new Array(2, "hello", 'S');
        obj[2] = new Array(3, "Venugopal", 'k');
        obj[3] = new Array(4, "hello", 'S');
        obj[4] = new Array(89, "Sasi", 'o');
        obj[0].display();
        obj[1].display();
        obj[2].display();
        obj[3].display();
        obj[4].display();
    }
}
