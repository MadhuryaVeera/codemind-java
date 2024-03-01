import java.util.*;
public class RomeoAndJuliet {
public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
     int x = scan.nextInt();
     int y = scan.nextInt();
     int z = scan.nextInt();
     int totalMoney = 5 * x + 10 * y;
     System.out.print(totalMoney / z);
  }
}