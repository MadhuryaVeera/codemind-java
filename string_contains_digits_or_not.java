import java.util.*;
public class StringContainDigitOrNot{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i =0;i<n;i++){
            String s = sc.next();
            if(s.matches(".*\d.*")){    // here s.matches(".*\d.*")------> can check the if the  given string conatains the digits or not if it contains digit then it can pritn the yes otherewise print no .
                System.out.println("Yes");
            }
            else{
                System.out.println("No");
            }
        }
    }
}