import java.util.Scanner;
public class Ex{
  public static void main(String args[]){
      Scanner sc=new Scanner(System.in);
      String s = sc.nextLine();// reading the string with the spaces 
      
      // here we can use the string_name.split("\s") -> it means it will split the string art the each whitespaacee character
      // and resulting the output as the array of substrigs 
      // ex:Pavan sir is a excellent teacher
      // the .split("\s") can converrt into the ->["Pavan","sir","is","a","excellent","teacher"]
      // and the length is used to find the array of subsrings length right above the ex it can give 6
      
      int counting_words = s.split("\s").length;
      System.out.println(counting_words);
   }
}