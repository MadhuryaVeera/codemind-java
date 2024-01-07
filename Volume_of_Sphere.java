import java.util.*;
public class Sm{
    public static void main(String args[])
    {
        Scanner k=new Scanner(System.in);
         int a= k.nextInt();
        double s= (4.0/3.0)*a*a*a;
        System.out.printf("%.2f",s*3.14);
    }
}