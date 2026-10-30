// Class declaration
public class Cube {
   
   // Instance variable
   boolean isSolved;
   
   // Constructor
   public Cube() {
      isSolved = true;
   }
   public Cube(boolean shouldScramble) {
      isSolved = shouldScramble;
   }
   
   // Method declarations
   public String move(String moveToMake) {
      return moveToMake;
   }
   
   public String scramble(int numMoves) {
      String scramble = "";
      String[] moves = {"R", "R'", "R2", "L", "L'", "L2", "U", "U'", "U2", "D", "D'", "D2", "F", "F'", "F2", "B", "B'", "B2"};
      if(isSolved) {
         for(int x = 1; x <= numMoves; x++) {
            scramble += (moves[(int) (Math.random() * 18)] + " ");
         }
      }
      else {
         scramble += "The cube is already scrambled";
      }
      return scramble;
   }
         
}