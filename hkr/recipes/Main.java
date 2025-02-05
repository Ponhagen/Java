package se.hkr.recipes;

import java.util.List;


public class Main {
    // Main method for running program
    public static void main(String[] args) {
        // Create a new recipeBox
        RecipeBox recipeBox = new RecipeBox();


        // Create Recipe objects
        Recipe chocolateCake = new Recipe("Chocolate Cake", "American", DifficultyLevel.EASY);
        // Add ingredients to the chocolate cake recipe
        chocolateCake.addIngredient(new Ingredient(("Flour"), "2 cups"));
        chocolateCake.addIngredient(new Ingredient("Sugar", "1 cup"));
        chocolateCake.addIngredient(new Ingredient("Cocoa Powder", "1/2 cup"));
        // Add steps to chocolate cake recipe
        chocolateCake.addStep(new Step(1, "Mix dry ingredients."));
        chocolateCake.addStep(new Step(2, "Add wet ingredients and mix."));
        chocolateCake.addStep(new Step(3, "Bake at 350F for 35 minutes."));

        Recipe swedishMeatballs = new Recipe("Swedish Meatballs", "Swedish", DifficultyLevel.MEDIUM);
        // Add ingredients to swedish meatballs recipe
        swedishMeatballs.addIngredient(new Ingredient("Ground Beef", "500g"));
        swedishMeatballs.addIngredient(new Ingredient("Breadcrumbs", "120 ml"));
        swedishMeatballs.addIngredient(new Ingredient("Milk", "6 dl"));
        swedishMeatballs.addIngredient(new Ingredient("Onion", "1 small, finely chopped"));
        swedishMeatballs.addIngredient(new Ingredient("Egg", "1"));
        // Add steps to swedish meatballs recipe
        swedishMeatballs.addStep(new Step(1, "Combine ground beef, breadcrumbs, milk, onion, and egg."));
        swedishMeatballs.addStep(new Step(2, "Form into small balls and fry until browned."));
        swedishMeatballs.addStep(new Step(3, "Serve with lingonberry sauce and mashed potatoes."));

        // Add Recipe objects to RecipeBox
        recipeBox.addRecipe(chocolateCake);
        recipeBox.addRecipe(swedishMeatballs);

        // Showcase all functionalities
        System.out.println("Chocolate Cake Details:");
        System.out.println(chocolateCake); // Prints details of chocolate recipe
        System.out.println();

        System.out.println("Swedish Meatballs Details:");
        System.out.println(swedishMeatballs); // Prints details of swedish meatballs recipe
        System.out.println();

        System.out.println("Recipes in the Box:");
        List<String> recipeNames = recipeBox.getRecipeNames(); // Gets list from recipeBox
        for (String recipeName : recipeNames) {
            System.out.println(recipeName); // Prints each recipe name
        }
        System.out.println();

        System.out.println("Search Recipes by Ingredient:");
        List<Recipe> searchResults = recipeBox.searchRecipesByIngredient("milk"); // Search for recipes contaning milk
        for (Recipe recipe : searchResults) { // Loops through recipe
            System.out.println(recipe.getName()); // prints name of recipe that has milk
        }
        System.out.println();

        System.out.println("Random Recipe Suggestion:");
        Recipe randomRecipe = recipeBox.getRandomRecipe(); // Gets a random recipe from recipeBox
        System.out.println(randomRecipe.getName()); // Prints name of random recipe
    }
}

