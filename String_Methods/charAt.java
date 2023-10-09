package String_Methods;

public class charAt {

    public static void main(String[] args) {

        String name = "HEllO";
        String s1 = "HELLO WORLD";
        char ch = name.charAt(1);
        System.out.println(ch);
        System.out.println(s1.charAt(5));
        System.out.println(s1.charAt(-1)); //String outer bound exception 

    }
}