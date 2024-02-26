import java.util.*;
public class StrConc{
    public static void main(String args[]){
        Scanner sc  = new Scanner(System.in);
        String str1 = sc.nextLine(); // reading str1 
        String str2 = sc.nextLine();  // reading str2
        String str3 = str1.concat(str2); // for  concating and do the futther modifications i can store the concatenates string in a new string str3.
        char ch[] = str3.toCharArray(); // toCharArray is to convert the strin into character array likr s u d h i r like that.
        Arrays.sort(ch); //sorting the character array 
        System.out.println(ch);
        
    }
}