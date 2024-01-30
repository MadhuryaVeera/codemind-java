import java.util.Scanner;
public class Ex{
  public static void main(String args[]){
      Scanner sc=new Scanner(System.in);
      int n= sc.nextInt();
      int l=sc.nextInt();
      if(l*2<=n) System.out.print("YES");
      else System.out.print("NO");
   }
}