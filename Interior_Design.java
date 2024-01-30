import java.util.Scanner;
public class Ex{
  public static void main(String args[]){
      Scanner sc=new Scanner(System.in);
      int n= sc.nextInt();
      int nn= sc.nextInt();
      int nnn= sc.nextInt();
      int nnnn= sc.nextInt();
      if(n+nn<=nnn+nnnn) System.out.print(n+nn);
        else System.out.print(nnn+nnnn);
   }
}