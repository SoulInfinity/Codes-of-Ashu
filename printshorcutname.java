
//import java.io.*;
import java.util.Scanner;

public class printshorcutname {
	public static void main(String[] args) {
		//BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Scanner br = new Scanner(System.in);
		System.out.print("\nEnter your Fisrt name:\t");
		char firstname = br.next().charAt(0);

		System.out.print("\nEnter middle Name:\t");
		char midname = br.next().charAt(0);

		System.out.print("\nEnter your last name:\t");
		String lastname = br.nextLine();

		System.out.println("\n Abbreviated Name:\t" + firstname + "." + midname + "." + lastname);
		br.close();
	}
}

    