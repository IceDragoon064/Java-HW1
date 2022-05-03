import java.util.Scanner;


/**
 * This is HW1, Problem 1
 * @author Leon Lu
 * Project Due Date: May 3, 2022 (Tuesday)
 * This class calculate which bill or coin is needed based on user money input 
 */
public class ChangeCalculator
{
	
	/**
	 * method to calculate how many bill and/or coin will be used
	 * @param changeAmount - value that will be passed into the method to calculate change
	 */
	static void calculateValue(Double changeAmount) 
	{
	    // Variable that acts remainder from subtracting changeAmount with the above variables
	    Double remainingAmount = changeAmount;	
	    
	    // Array to store money value as double
	    Double[] moneyValue = 
	    	{20.00, 10.00, 5.00, 1.00, 0.25, 0.10, 0.05, 0.01};
	    
	    // Array to store string println output each element must match with moneyValue element
	    String[] outputText = 
	    	{" twenty dollar bills", " ten dollar bills", " five dollar bills", " one dollar bills"," quarters"," dimes"," nickles", " pennies"};
	    
	    /**
	     * For loop to calculate number of bills and coins
	     */
	    for(int i = 0; i < moneyValue.length; i++)
	    {
	    	// Variable to show how many bills or coins will be needed
	    	int value = 0;
	    	Boolean elementDone = false;
	    	
	    	/**
	    	 * While loop to check if remainingAmount can be subtracted further by moneyValue
	    	 * If remainingAmount is less than moneyValue, elementDone is set to true to exit out of while loop
	    	 */
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
		    		//Setting variable to true will cause while loop to be terminated
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
		Boolean correctInput = false; //Parameter variable for while loop
		
		/**
		 * While loop to ensure that the user inputs a float before continuing
		 */
		while(!correctInput)
		{
			// Create scanner object
			Scanner userInput = new Scanner(System.in);  
		    System.out.println("Enter change amount without the $ symbol and as a double. Example: $13.36 will be 13.36");

		    
		    // Check if input is a double
		    if(userInput.hasNextDouble())
		    {
		    	//Assign changeAmount as the input double to be passed to calculateValue method
		    	changeAmount = userInput.nextDouble();
		    	System.out.println("Amount: $" + String.format("%.2f", changeAmount));
		    	correctInput = true;
		    }

		    else
		    {
		    	System.out.println("Invalid input. Try again.");
		    } 
		}
		
		// Call calculate method
		calculateValue(changeAmount);
	    System.exit(0);
	}
	    
}