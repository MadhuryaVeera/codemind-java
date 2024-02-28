 import java.util.*;
public class Testing{
    public static void main(String args[]){                                 ///String contain digit or not in codemind succeess */
        Scanner sc= new Scanner(System.in);                                //  finding if there is a digit then printing the contain and  that count digit and then digit if  (there is no digit present then we can print hte Doesn't contain the digit)
        String s = sc.nextLine();                                            
        char[] ch = s.toCharArray();  // to convert string to characterarray (because we can check the present string) 
        int count =0;           // to check the present digits in a chararray 
        for(int i =0;i<ch.length;i++){            
            if(Character.isDigit(ch[i])){   // checking each digit by the Character.isDigit() method and  i here means an index in which and ch[i] which means we are checking the each value of an that particular indeex  in the character Aray 
                count++;                    // if the digit is present then the we incresing count 
            }
        }
        if(count==0){
            System.out.println("Doesn't contain digit");        // if  the count is 0 which means no digit is present then printing the following sout statement
        }
        else{
            System.out.println("Contains "+count+" digit"); 
        }
        
    }
}

