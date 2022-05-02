import java.util.Scanner;


/**
 * This is HW1, Problem 1
 * @author Leon Lu
 * Project Due Date: May 3, 2022 (Tuesday)
 * This class calculate which bill or coin is needed 
 * based on user money input 
 */
public class ChangeCalculator
{
	
	// Function to calculate how many
	// Bill and/or coin will be used
	static void calculateValue(Double changeAmount) 
	{
	    // Variable as a remainder from subtracting changeAmount with the above variables
	    Double remainingAmount = changeAmount;	
	    
	    // Array to store money value as double
	    Double[] moneyValue = 
	    	{20.00, 10.00, 5.00, 1.00, 0.25, 0.10, 0.05, 0.01};
	    
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
	    	Boolean elementDone = false;
	    	
	    	// While loop will continue until remainingAmount is less than moneyValue
	    	// Example: if remainingAmount is 19.81 and moneyValue is 20.00, 
	    	// the while loop will be stopped by elementDone boolean setting to true
	    	while(!elementDone)
	    	{
		    	if(remainingAmount >= moneyValue[i])
		    	{
		    		value++;
		    		remainingAmount = remainingAmount - moneyValue[i];
		    		
		    		//Ensure double is properly rounded up
		    		remainingAmount = Math.round(remainingAmount * 100.0) / 100.0;
		    	}
		    	
		    	else
		    	{
		    		elementDone = true;
		    	}
	    	}

	    	// Print out how many bill or coin
	    	System.out.println(value + outputText[i]);
	    }  
	}
	

	public static void main(String args[])
	{  
		Double changeAmount  = 0.0;
		Boolean correctInput = false;
		//While loop to ensure that the user inputs a float before continuing
		while(!correctInput)
		{
			// Create scanner object
			Scanner userInput = new Scanner(System.in);  
		    System.out.println("Enter change amount without the $ symbol and as a double. Example: $13.36 will be 13.36");

		    
		    // Check if input is a double
		    if(userInput.hasNextDouble())
		    {
		    	changeAmount = userInput.nextDouble();
		    	System.out.println("Amount: $" + String.format("%.2f", changeAmount));
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