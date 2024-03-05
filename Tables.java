import java.util.*;
public class Tables{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nn = sc.nextInt();
       for(int i =1; i<=nn;i=i+2){
           System.out.println(n+" "+"x"+" "+i+" "+"="+" "+n*i);
       }
    }
}