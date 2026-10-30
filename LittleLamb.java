public class LittleLamb {
   public static void main(String[] args) {
      System.out.print("Mary had a ");
      marysPet("little lamb");
      marysPet("little lamb");
      marysPet("little lamb", ".");
   }
   
   public static void marysPet(String petName, String punctuation) {
      System.out.print(petName + punctuation);
   }
   
   public static void marysPet(String petName) {
      System.out.print(petName + ", ");
   }
}