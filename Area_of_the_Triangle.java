import java.util.*;
public class Sm{
    public static void main(String args[])
    {
        Scanner k=new Scanner(System.in);
        double a= k.nextInt();
        double b= k.nextInt();
        double c= k.nextInt();
        double s=(a+b+c)/2;
        double l=s*(s-a)*(s-b)*(s-c);
        System.out.printf("%.2f",Math.sqrt(l));
    }
}