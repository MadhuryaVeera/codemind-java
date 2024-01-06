import java.util.*;
public class Sm{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        double k=Math.sqrt((a*a)+(b*b));
        System.out.printf("%.2f",k);
    }
}