public class Burger {
   // instance variables
   private int numPatties;
   private boolean isTasty;
   private double gramsOfSauce;
   private String burgerName;
   private int numBites;
   
   // constructors
   // first let's do the no-argument constructor
   public Burger() {
      numBites = 0;
      numPatties = 2;
      isTasty = true;
      gramsOfSauce = 10;
      burgerName = "Bland burger";
   }
   
   public Burger(int numPatties, boolean isTasty, double gramsOfSauce, String burgerName) {
      this.numBites = 0;
      this.numPatties = numPatties;
      this.isTasty = isTasty;
      this.gramsOfSauce = gramsOfSauce;
      this.burgerName = burgerName;
   }
   
   // methods
   public void bite() {
      System.out.println("Chomp...");
      numBites++;
   }
   
   public int getNumBites() {
      return numBites;
   }
   
   public static String getRecipe() {
      return "Cook the patties, put them on the bun, add too much sauce, add EVEN MORE sauce.";
   }
   
   public static void main(String[] args) {
      Burger sBurger = new Burger();
      Burger kBurger = new Burger(3, true, 50, "Big Kondiment");
      kBurger.bite();
      System.out.println("Bites taken from the Big Kondiment: " + kBurger.getNumBites());
      System.out.println("How to make a Big K: " + getRecipe());
   }
}