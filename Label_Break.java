public class Label_Break {
    public static void main(String[] args) {
        outerLoop:
        for(int i = 0;i<5;i++)
        {
            for(int j=0;j<4;j++)
            { 
                if(i==3)
                break outerLoop;
            
            System.out.println("The value of i is:"+i+" "+"The value of j is:"+j);
        }
    }
}
}