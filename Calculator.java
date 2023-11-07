public class Calculator {
   public static void main(String args[]) {
      int k1, k2, k3, result = 0;
      if (args.length != 3) {
         System.out.println("Must be a operand then operator then operand");
         System.exit(0);
      }
      k1 = Integer.parseInt(args[0]);
      k2 = Integer.parseInt(args[2]);
      if (args[1].equals("+"))
         result = k1 + k2;
      else if (args[1].equals("-"))
         result = k1 - k2;
      else if (args[1].equals("*"))
         result = k1 * k2;
      else if (args[1].equals("/"))
         result = k1 / k2;
      else if (args[1].equals("%"))
         result = k1 % k2;
      else {
         System.out.println("Invalid Operator:" + args[1]);
         System.exit(0);
      }
      System.out.println(args[0] + " " + args[1] + " " + args[2] + "=" + result);
   }
}
