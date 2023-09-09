public class Ex5_Q3 {
    public static void main(String[] args) {
        int sum = 0;
        for(int n=0;n<args.length;n++)
        {
            sum = sum+Integer.parseInt(args[n]);
        }
        System.out.println("Sum of Five numbers is:"+sum);
    }
}
