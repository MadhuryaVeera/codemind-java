import java.util.Scanner;
public class MyClass{
    public static void main(String args[]){
        Scanner sm=new Scanner(System.in);
        int p=0,s=0;
        int a = sm.nextInt();
        while(a!=0){
        int r=a%10;//157%10=7; 15%10=5;
        double e=Math.pow(8,p);//(8^0=1);(8^1=8)
        s+=(e*r);//(7*1=7(s))
        p++;
        a=a/10;
        }
        System.out.printf("%d",s);
    }
}