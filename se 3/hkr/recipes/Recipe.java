package se.hkr.recipes;

import java.util.ArrayList;
import java.util.List;

//class for Recipe
public class Recipe {
    private String name; // Name of recipe
    private String cuisine;  // Cuisine of recipe
    private List<Ingredient> ingredients; //List of ingredients for recipe
    private List<Step> steps; // List of steps för recipe
    private DifficultyLevel difficulty; // Difficulty level

    // constructor for recipe class
    public Recipe(String name, String cuisine, DifficultyLevel difficulty) {
        // Start name, cuisine, ingredients, steps, recipe
        this.name = name;
        this.cuisine = cuisine;
        this.difficulty = difficulty;
        this.ingredients = new ArrayList<>(); // start of ingredients list
        this.steps = new ArrayList<>(); // Start of steps list
    }
     // Method for adding a ingredient to recipe
    public void addIngredient(Ingredient ingredient) {
        this.ingredients.add(ingredient);
    }
     // Method for adding a step to the recipe
    public void addStep(Step step) {
        this.steps.add(step);
    }
     // Getter for name of recipe
    public String getName() {
        return name;
    }
     // Setter for name of recipe
    public void setName(String name) {
        this.name = name;
    }
     // Getter for cuisine
    public String getCuisine() {
        return cuisine;
    }
     // Setter for cuisine
    public void setCuisine(String cuisine) {
        this.cuisine = cuisine;
    }
     //Getter for ingredients
    public List<Ingredient> getIngredients() {

        return ingredients;
    }
     // Setter for ingredients
    public void setIngredients(List<Ingredient> ingredients) {
        this.ingredients = ingredients;
    }
     // Getter for steps
    public List<Step> getSteps() {

        return steps;
    }
     // setters for steps
    public void setSteps(List<Step> steps) {
        this.steps = steps;
    }
     // Getter for difficulty level
    public DifficultyLevel getDifficulty() {
        return difficulty;
    }
     // setter for difficulty level
    public void setDifficulty(DifficultyLevel difficulty) {
        this.difficulty = difficulty;
    }
    //Method for returning a string of recipe
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder(); // Omvandla allt till en string
        sb.append("Recipe: ").append(name).append("\n"); // append name of the recipe
        sb.append("Cuisine: ").append(cuisine).append("\n"); // Append cuisine of recipe
        sb.append("Difficulty: ").append(difficulty).append("\n"); // Append difficulty
        sb.append("Ingredients:\n"); // Start of new line with ingredients
        for (Ingredient ingredient : ingredients) { // Loop through each ingredient
            sb.append("  ").append(ingredient.getName()).append(" - ").append(ingredient.getQuantity()).append("\n"); // Append name and quantity
        }
        sb.append("Steps:\n"); // new line for step
        for (int i = 0; i < steps.size(); i++) { // loop through each step
            sb.append("  ").append(i + 1).append(". ").append(steps.get(i).getInstruction()).append("\n"); // Append instruction step
        }
        return sb.toString(); // Return String of recipe
    }
}




