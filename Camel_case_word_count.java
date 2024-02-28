 import java.util.*;
public class Testing{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int count = 1;
        String  s = sc.next();
        char[] ch = s.toCharArray();                              // not woriking some hidden test casws are  Camel case word count in codemind
        for(int i =1;i<ch.length;i++){
            if(Character.isUpperCase(ch[i])){
                count++;
            }
        }
        System.out.println(count);
    }
}