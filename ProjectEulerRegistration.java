public class ProjectEulerRegistration {
   public static long problem0() {
      //Sum of odd squares (first 722000)
      long sum = 0;
      int count = 1;
      while (count <= 722000) {
         if (count % 2 == 1) {
            sum += Math.pow(count, 2);
         }
         count++;
      }
      return sum;
   }
   
   public static void main(String[] args) {
      System.out.println("The answer to problem 0 is: " + problem0());      
   }
}