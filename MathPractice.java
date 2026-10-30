import java.util.Scanner;

public class MathPractice {
   public static void main(String[] args) {
      
      // variables
      boolean gameOver = false;
      boolean beatBest = false;
      int num;
      int numWins = 0;
      int guess;
      int highscore = 0;
      String gameplay = "0 or 1? You've guessed correctly " + numWins + " times so far. Your highscore: ";
      
      // gameplay
      while(gameOver != true) {
         num = (int)(Math.random() * 2);
         System.out.println(gameplay + highscore);
         Scanner scan = new Scanner(System.in);
         guess = scan.nextInt();
         if(guess == num) {
            numWins++;
            System.out.println("Correct!");
            if(numWins > highscore) {
               highscore = numWins;
               beatBest = true;
            }
         }
         else {
            gameOver = true;
            System.out.println("Too bad, it was " + num + ". Highscore: " + highscore);
            if(beatBest == true) {
               System.out.println("You beat your previous highscore!");
            }
            System.out.println("\n\nWould you like to play again? y/n");
            String again = scan.next();
            if(again.equals("y") || again.equals("Y") || again.equals("yes") || again.equals("Yes")) {
               gameOver = false;
               beatBest = false;
               numWins = 0;
               System.out.println("\n");
            }
            else {
               scan.close();
            }
         }
      }
   }
}