package se.hkr.recipes;

public class Step {  // Cooking steps for recipe
    private int stepNumber; // step number
    private String instruction; //Instructions for step

    // Constructor for step class
    public Step(int stepNumber, String instruction) {
        this.stepNumber = stepNumber; // Start step number and instructions
        this.instruction = instruction;
    }

    public int getStepNumber() { // getter for step number
        return stepNumber;
    }

    public void setStepNumber(int stepNumber) { // Setter method for step number
        this.stepNumber = stepNumber;
    }

    public String getInstruction() { // Method for getting instruction
        return instruction;
    }

    public void setInstruction(String instruction) { // Setter for instruction
        this.instruction = instruction;
    }

    @Override
    public String toString() { // Method for returning a string of step class
        return "Step{" +
                "stepNumber=" + stepNumber +
                ", instruction='" + instruction + '\'' +
                '}'; // Return string
    }
}






