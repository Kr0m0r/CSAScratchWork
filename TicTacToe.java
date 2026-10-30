import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

public class TicTacToe {

   ArrayList<Integer> filled = new ArrayList<>();
   ArrayList<Integer> xMoves = new ArrayList<>();
   ArrayList<Integer> oMoves = new ArrayList<>();
   int[][] winningLines = { {1,2,3}, {4,5,6}, {7,8,9}, {1,4,7}, {2,5,8}, {3,6,9}, {1,5,9}, {3,5,7} };
   
   public void main(String[] args) {
      
      // variables
      
      int index = -1;
      boolean isPlaying = true;
      int nextMove;
      String board = """
      
      
      
                      |   |   
                    1 | 2 | 3 
                   ___|___|___
                      |   |   
                    4 | 5 | 6 
                   ___|___|___
                      |   |   
                    7 | 8 | 9 
                      |   |   
                      
                              """;
                      
      // gameplay
      
      System.out.println(board);
      while (isPlaying) {
         for (int a = 0; a < 9; a++) {
            nextMove = newTurn(getPlayer(index));
            if (getPlayer(index) == "X") {
               xMoves.add(nextMove);
            }
            else {
               oMoves.add(nextMove);
            }
            board = board.replace(nextMove + "", getPlayer(index));
            if (didWin(index) == true) {
               isPlaying = false;
               for (int e = 1; e <=9; e++) {
                  if (filled.contains(e) == false) {
                     board = board.replace(e + "", " ");
                  }
               }
               System.out.println(board);
               System.out.print(getPlayer(index) + " wins!");
               index = 0;
               break;
            }
            System.out.println(board);
            index *= -1;
         }
         isPlaying = false;
         if (index != 0) {
            System.out.print("It's a tie");
         }
      }
      
      
   }
   
   // methods
   
   public int newTurn(String player) {
      boolean validMove = false;
      int move = 0;
      Scanner scan = new Scanner(System.in);
      System.out.println("Your turn " + player + ", where do you want to play (1 - 9)?");
      while (validMove == false) {
         move = (int) scan.nextDouble();
         if (move > 0 && move < 10) {
            if (filled.contains(move) == false) {
               filled.add(move);
               validMove = true;
            }
            else {
               System.out.println("Not valid, please choose an empty cell between 1 and 9");
            }
         }
         else {
            System.out.println("Not valid, please choose an empty cell between 1 and 9");
         }
      }
      return move;
   }
   
   public static String getPlayer(int num) {
      if (num < 0) {
         return "X";
      }
      else {
         return "O";
      }
   }
   public boolean didWin(int player) {
      boolean won = false;
      if (getPlayer(player) == "X") {
         for(int x = 0; x < winningLines.length; x++) {
            if (lineOfThree(winningLines, x, xMoves)) {
               won = true;
            }
         }
      }
      if (getPlayer(player) == "O") {
         for(int o = 0; o < winningLines.length; o++) {
            if (lineOfThree(winningLines, o, oMoves)) {
               won = true;
            }
         }
      }
      if (won == true) {
         return true;
      }
      else {
         return false;
      }
   }
   
   public boolean lineOfThree(int[][] trios, int row, ArrayList<Integer> moves) {
      for (int v : trios[row]) {
         if (!moves.contains(v)) {
            return false;
         }
      }
      return true;
   }
}