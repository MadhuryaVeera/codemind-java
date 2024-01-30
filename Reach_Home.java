import java.util.Scanner;
public class Ex{
  public static void main(String args[]){
      Scanner sc=new Scanner(System.in);
      int n= sc.nextInt();
      int k=sc.nextInt();
      if(n*5>=k) System.out.print("YES");
      else System.out.print("NO");
   }
}