import java.util.Scanner;
public class Ex{
  public static void main(String args[]){
      Scanner sc=new Scanner(System.in);
      String s = sc.next();
      String ss = sc.next();
      if(s.equals(ss)) System.out.print("Strings are Equal");
        else System.out.print("Strings are not Equal");
   }
}