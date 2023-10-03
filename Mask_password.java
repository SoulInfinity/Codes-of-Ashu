import java.io.*;
public class Mask_password {
    public static void main(String[] args) {
        Console cons;
        if((cons=System.console())!=null)
        {
            System.out.println("Please enter your password");
            char password[]= cons.readPassword();
            System.out.println("Your Password is :"+new String (password));
        }
        else{
            System.out.println("No console found");
        }
    }
}
