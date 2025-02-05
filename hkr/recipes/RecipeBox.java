package se.hkr.recipes;

import java.util.*;
// class to manage recipeBox
public class RecipeBox {
   // Map for storing recipes, recipe name as key
    private Map<String, Recipe> recipes;
    // Constructor for recipeBox
    public RecipeBox() {
        this.recipes = new HashMap<>();
    }
    // Method for adding recipe to recipeBox
    public void addRecipe(Recipe recipe) {
        recipes.put(recipe.getName(), recipe);
    }
    // Method for getting a list of recipe names from recipeBox
    public List<String> getRecipeNames() {
        return new ArrayList<>(recipes.keySet()); // Returns list of recipe from recipe map
    }
    // Method for searching recipe by ingredient name
    public List<Recipe> searchRecipesByIngredient(String ingredientName) {
        // Start a list for storing search result
        List<Recipe> result = new ArrayList<>();
        // Loop through all recipes in map
        for (Recipe recipe : recipes.values()) {
            // check if any ingredient name matches with search
            if (recipe.getIngredients() // Get the list if ingredients from recipe object
                    .stream() // Creates a stream from list of ingredients
                    .anyMatch(ingredient -> ingredient.getName() // checks if any ingredient in stream matches
                            .equalsIgnoreCase(ingredientName))) { // Checks if name of ingredient is equal to input
                result.add(recipe); // If its a match then add to search result
            }
        }
        return result;
    }

    public Recipe getRandomRecipe() { // Method for random recipe
        List<Recipe> recipeList = new ArrayList<>(recipes.values()); // Start a list storing recipes in map
        Random random = new Random(); // random generator
        return recipeList.get(random.nextInt(recipeList.size())); // random recipe and return it
    }
}








