public class StringFun {
   public static void main(String[] args) {
      String myString = "Hello";
      String otherString = "World!";
      // concatination
      System.out.println(myString + " world!");
      // length
      System.out.println(myString.length());
      // index
      System.out.println(myString.indexOf("o"));
      // compare 2 strings
      System.out.println(myString.compareTo(otherString));
      // check if 2 strings are equal
      System.out.println(myString.equals(otherString));
      // make a new substring
      System.out.println(myString.substring(1, 3));


   }
}