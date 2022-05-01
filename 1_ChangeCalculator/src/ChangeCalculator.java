import java.util.Scanner;

/**
 * @author Leon Lu
 * Project Due Date: May 3, 2022 (Tuesday)
 */


/**
 * This is HW1, Problem 1
 * @author Leon Lu
 * This class calculate which bill or coin is needed 
 * based on user money input 
 */
public class ChangeCalculator
{
	
	// Function to calculate how many
	// Bill and/or coin will be used
	static void calculateValue(int changeAmount) 
	{
	    // Variable as a remainder from subtracting changeAmount with the above variables
	    int remainingAmount = changeAmount;	
	    
	    // Array to store money value as float
	    int[] moneyValue = 
	    	{2000, 1000, 500, 100, 25, 10, 5, 1};
	    
	    // Array to store string println output
	    // Each element must match with moneyValue element
	    String[] outputText = 
	    	{" twenty dollar bills", " ten dollar bills", " five dollar bills", " one dollar bills"," quarters"," dimes"," nickles", " pennies"};
	    
	    // The for loop calculates the number of bills and coins
	    // This is done by comparing the remainingAmount with each element of moneyValue array
	    for(int i = 0; i < moneyValue.length; i++)
	    {
	    	// Variable to show how many bills or coins will be needed
	    	int value = 0;
	    	
	    	if(remainingAmount >= moneyValue[i])
	    	{
	    		value = remainingAmount / moneyValue[i];
	    		remainingAmount = remainingAmount - (value * moneyValue[i]);
	    	}
	    	
	    	// Print out how many bill or coin
	    	System.out.println(value + outputText[i]);
	    }  
	}
	

	public static void main(String args[])
	{  
		Integer changeAmount  = 0;
		Boolean correctInput = false;
		//While loop to ensure that the user inputs a float before continuing
		while(!correctInput)
		{
			// Create scanner object
			Scanner userInput = new Scanner(System.in);  
		    System.out.println("Enter change amount without the $ symbol and as an integer. Example: $13.36 will be 1336");

		    
		    // Check if input is an integer
		    // Notify user when an integer is found instead of double
		    if(userInput.hasNextInt())
		    {
		    	changeAmount = userInput.nextInt();
		    	float printValue = changeAmount.floatValue() / 100;
		    	System.out.println("Amount: $" + String.format("%.2f", printValue));
		    	correctInput = true;
		    }

		    else
		    {
		    	System.out.println("Invalid input. Try again.");
		    } 
		}
		
		// Call calculate function
		calculateValue(changeAmount);
	    System.exit(0);
	}
	    
}