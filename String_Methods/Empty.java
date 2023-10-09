package String_Methods;

public class Empty {
    public static void main(String[] args) {
        String str = "";
        String str1 = null;
        System.out.println(str.isEmpty());//Returns true value
        System.out.println(str1.isEmpty());//Exception in thread "main" java.lang.NullPointerException
    }
}
