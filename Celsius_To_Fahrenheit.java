import java.util.*;
public class Ascii {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        double  c = sc.nextDouble();
        double  f = c*1.8;
        double k = f+32;
        System.out.printf("%.2f",k);
        
    }
}