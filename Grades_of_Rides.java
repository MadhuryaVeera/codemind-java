import java.util.Scanner;
public class Ex{
  public static void main(String args[]){
      Scanner sc=new Scanner(System.in);
      int Hurl_Fac= sc.nextInt();
      int Spin_Fac= sc.nextInt();
      int Speed_Fac= sc.nextInt();
      if(Hurl_Fac>50 && Spin_Fac >60 && Speed_Fac>100) {System.out.print(10);}
      else if(Hurl_Fac>50 && Spin_Fac >60) {System.out.print(9);}
      else if(Spin_Fac >60 && Speed_Fac>100) {System.out.print(8);}
      else if(Hurl_Fac>50 && Speed_Fac>100) {System.out.print(7);}
      else if(Hurl_Fac>50 || Spin_Fac >60 || Speed_Fac>100) {System.out.print(6);}
      else{System.out.print(5);}
      

   }
}
