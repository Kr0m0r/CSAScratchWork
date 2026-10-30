public class Algorithms {

   public static void main(String[] args) {
      System.out.println(sumAllNumsLessThan(100));
      System.out.println(largestRandomNumber(100));
   }
   
   public static int sumAllNumsLessThan(int num) {
      int sum = 0;
      for (int i = 1; i < num; i++) {
         sum += i;
      }
      return sum;
      //Faster way
      //
      //return ((num) * (num - 1) / 2);
   }
   
   public static int largestRandomNumber(int loopTimes) {
      int max = -10000;
      for (int i = 0; i <= loopTimes; i++) {
         int num = (int) (Math.random() * 10000);
         if (num > max) {
            max = num;
         }
      }
      return max;
   }
}