package String_Methods;

public class substring {
    public static void main(String[] args) {
        String s1 = "Javaprogram";
        System.out.println(s1.substring(2, 4));
        System.out.println(s1.substring(2));
        String substr = s1.substring(0);
        System.out.println(substr);
        String substr1 = s1.substring(4, 8);
        System.out.println(substr1);
        String substr3 = s1.substring(5, 15);//String outerbound exception
        System.out.println(substr3);
    }
}
