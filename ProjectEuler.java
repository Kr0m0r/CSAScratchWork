public class ProjectEuler {
   
   public static int problem2() {
      //Even Fibonacci Numbers
      int num1 = 1;
      int num2 = 2;
      int sum = 2;
      while (num1 < 4000000 && num2 < 4000000) {
         num1 += num2;
         if (num1 % 2 == 0 && num1 < 4000000) {
            sum += num1;
         }
         num2 += num1;
         if (num2 % 2 == 0 && num2 < 4000000) {
            sum += num2;
         }
      }
      return sum;
   }
   
   public static int problem9() {
      //Product of Pythagorean Triple that Sums to 1000
      int a = 0;
      int b = 0;
      double c = 0;
      int product = 0;
      while (product == 0) {
         while (a < 332) {
            while (b < 999) {
               b++;
               c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
               if ((a + b + c) == 1000) {
                  product = a * b *  (int) c;
                  break;
               }
            }
            if ((a + b + c) == 1000) {
               product = a * b * (int) c;
               break;
            }
            a++;
            b = a;
            c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
         }
      }
      System.out.println("\na: " + a + "\nb: " + b + "\nc: " + (int) c);
      return product;
   }
   
   public static void main(String[] args) {
      System.out.println("The answer to problem 2 is: " + problem2());
      System.out.println("The answer to problem 9 is: " + problem9());      
   }  
}