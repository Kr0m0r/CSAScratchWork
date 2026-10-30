import java.util.Scanner;

public class WhilePractice {

   public static void main(String[] args) {
   
      Scanner in = new Scanner(System.in);
      String statement = in.nextLine();
      
      while(!statement.equals("Bye")) {
         System.out.println(statement);
         statement = in.nextLine();
      }
   }
}