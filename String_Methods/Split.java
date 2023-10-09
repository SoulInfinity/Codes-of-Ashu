package String_Methods;

public class Split {
    public static void main(String[] args) {
        String str = "Welcome@to@java";
        String arr[] = str.split("@",2);
        for(String i:arr)
        {
            System.out.println(i);
        }
    }
}
