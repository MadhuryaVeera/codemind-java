import java.util.Scanner;
public class Ex{
  public static void main(String args[]){
      Scanner sc=new Scanner(System.in);
      // reading the string with the spaces we use the nextLine
      String s = sc.nextLine();
      //reading the count for the vowels
      int vcount=0;
      for(int i=0;i<s.length();i++){
          //string name . charAt can we use to give the indexed values from 0 to legth-1
          //it throws an error if the range can exede the length()-1 (IndexOutOfBoundsException) or not less than the length of the string
          if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u'){
              vcount++;
          }
      }
      System.out.println(vcount);
      
   }
}