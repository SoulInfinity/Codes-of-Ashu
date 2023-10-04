public class Try_Catch
{
    public static void main(String[] args) {
        try{
        int num[] = {1,2,3,4,5};
        System.out.println(num[10]);
        } catch(Exception e)
        {
            System.out.println("Something went wrong");
    }
}
}