import java.util.*;
public class DigitCount{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();  //123
        int c=0;  
        while(n!=0)   // 123!=0
        {
            n=n/10;   //123/10=12; 12/10=1; 1/10=0
            c++;      // 1,2,3
        }
        System.out.println(c);
    }
}