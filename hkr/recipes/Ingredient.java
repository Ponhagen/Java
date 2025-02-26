package se.hkr.recipes;

public class Ingredient { // class for representing an ingredient in recipe
   private String name; // name of ingredient
   private String quantity; // quantity of ingredient

   public Ingredient(String name, String quantity) { // constructor for ingredient class
      this.name = name;
      this.quantity = quantity;
   }

   public String getName() { // method for getting the name
      return name; // return name
   }

   public void setName(String name) { // method for setting name
      this.name = name;
   }

   public String getQuantity() { // method for getting quantity
      return quantity;
   }

   public void setQuantity(String quantity) { // method for setting the name
      this.quantity = quantity; // set the quantity
   }
   // Method for returning a string of ingredient
   @Override
   public String toString() {
      return "Ingredient{" +
              "name='" + name + '\'' +
              ", quantity='" + quantity + '\'' +
              '}'; // Returns a string
   }
}




