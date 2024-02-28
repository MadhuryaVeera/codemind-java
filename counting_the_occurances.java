import java.util.*;
public class Count{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char[] ch = s.toCharArray();
        char c = sc.next().charAt(0);
        int count =0;
        for(int i=0;i<s.length();i++){
            if(ch[i]==c){
               count++;
                
            }
            
        }
        if(count==0){
            System.out.println(-1);
        }
        else{
        System.out.println(count);
        }
    }
}