import java.util.*;
public class Sm{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        double c=(a-b)/(a*1.0);
        System.out.printf("%.2f",100*c);
    }
}