import java.util.*;
public class Ascii {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        double  f = sc.nextDouble();
        double  c = f-32;
        double k = c/1.8;
        System.out.printf("%.2f",k);
    }
}