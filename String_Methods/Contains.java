package String_Methods;

public class Contains {
    public static void main(String[] args) {
        String s = "The House is situated in berhampur";
        System.out.println(s.contains("berhampur")); //true
        System.out.println(s.contains("is situated"));//true
        System.out.println(s.contains(" "));//true
        System.out.println(s.contains("bhubneswar"));//false
        System.out.println(s.contains(""));//true

    }
}
