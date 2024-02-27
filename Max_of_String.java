import java.util.*;
public class Max{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String  s  = sc.nextLine();    // reading the string
        char[]  ch = s.toCharArray();  // changing the string  into chararray
        Arrays.sort(ch);               //sorting the chararry 
        //System.out.println(ch);      // just checking  the output gettig sorted order or not
        System.out.println(ch[ch.length-1]); // printing the last element of charrray
        
    }
}