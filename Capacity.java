import java.util.*;
public class Sm{
    public static void main(String args[])
    {
        Scanner k=new Scanner(System.in);
        int  a= k.nextInt();
        int b= k.nextInt();
        int c= k.nextInt();
        int s=(2)*a*b*c*(512);
        int l=s/1024;
        System.out.printf("%d KB",(l));
    }
}