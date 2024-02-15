import java.util.Scanner;
public class Ex{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String  s  = sc.nextLine();//reding the inpput of the string
        int n = sc.nextInt();// reading the input of integer1
        int nn = sc.nextInt();//reding the input of integer2
        System.out.println(s.substring(n,nn+1));//extracting the slice of the string by using the substring()
    }
}