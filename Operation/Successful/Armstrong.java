package Operation.Successful;

public class Armstrong {
    public void Check(int n) {
        int r, sum = 0;
        int p = n;
        while (n != 0) {
            r = n % 10;
            sum = sum + (r * r * r);
            n = n / 10;
        }
        if (sum == p) {
            System.out.println("");
            System.out.println("It is an armstrong number");
        } else {
            System.out.println("");
            System.out.println("It is not an armstrong number");
        }
    }
}