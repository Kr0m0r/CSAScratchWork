import java.util.Scanner;

public class WindEnsemble {
   public static void main(String[] args) {
      int numStudents = 51;
      String teacherName = "Mr. G";
      boolean allPresent = false;
      double hoursPracticed = 122.43;
      
      System.out.println("There are " + numStudents + " students in our school's Wind Ensemble taught by " + teacherName + ".");
      System.out.println("Is everyone here today? " + allPresent);
      System.out.println("How many hours did you practice last week?");
      Scanner scan = new Scanner(System.in);
      hoursPracticed = hoursPracticed + scan.nextDouble();
      scan.close();
      System.out.printf("In total, the class practiced for " + hoursPracticed + " hours last week, or an average of %.2f hours per student.", (hoursPracticed / numStudents));
   }
}