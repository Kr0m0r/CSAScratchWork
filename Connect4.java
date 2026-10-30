import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

public class Connect4 {
   
   ArrayList<ArrayList<String>> board = new ArrayList<>();
   //ArrayList<ArrayList<String>> xMoves = new ArrayList<>();
   //ArrayList<ArrayList<String>> oMoves = new ArrayList<>();   
   
   public void main(String[] args) {
   
      for(int a = 0; a < 7; a++) {
         board.add(new ArrayList<>());
      }
      for(int y = 0; y < 7; y++) {
            for(int x = 0; x < 6; x++) {
               board.get(y).add(".");
         }
      }
      
      int index = -1;
      boolean isPlaying = true;
      while(isPlaying) {
         for(int y = 0; y < 6; y++) {
            for(int x = 0; x < 7; x++) {
               System.out.print(board.get(x).get(5 - y));
            }
            System.out.print("\n");
         }
         System.out.println("\nWhere do you want to play?");
         nextMove(getPlayer(index));
      }
   }
   
   public void nextMove(String player) {
      boolean validMove = false;
      Scanner input = new Scanner(System.in);
      while(validMove == false) {
         int col = input.nextInt();
         if(col > 0 && col < 8) {
            for(int i = 0; i < board.get(col - 1).size(); i++) {
               if(board.get(col - 1).get(i).equals(".")) {
                  validMove = true;
                  board.get(col - 1).set(i, player);
                  break;
               }
            }
            System.out.println("Invalid option, please choose an open column from 1-7.");
         }
         else {
            System.out.println("Invalid option, please choose a number from 1-7.");
         }
      }
   }
   
   public String getPlayer(int num) {
      if(num < 0) {
         return "X";
      }
      else {
         return "O";
      }
   }
}