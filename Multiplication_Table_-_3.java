import java.util.*;
public class VowelConst{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        int y = sc.nextInt();
        int k = sc.nextInt();
        for(int i = y; i<=k; i++){
            System.out.printf("%d x %d = %d
",n,i,n*i);
        }
    }
}