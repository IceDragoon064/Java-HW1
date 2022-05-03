import java.util.Scanner;

/**
 * This is HW1, problem 3
 * @author Leon Lu
 * Project Due Date: May 3, 2022 (Tuesday)
 * This class will test CubeIt.java class and methods
 */
public class CubeDriver 
{
	public static void main(String args[])
	{
		// Initialize variables
		double sideLength = 0.0;
		
		// Variable used for while loop parameter
		boolean correctInput = false;
		
		// Get user input
		Scanner userInput = new Scanner(System.in);
		System.out.println("Input cube side length");
		
		/**
		 * Force user to input a double before proceeding with the program
		 */
		while(!correctInput)
		{
			// Check input as a double
			// If the input is not a double, print a warning
			if (userInput.hasNextDouble())
			{
				sideLength = userInput.nextDouble();
				System.out.println("Length: " + sideLength);
				correctInput = true; //Boolean variable that causes while loop to terminate
			}
			
			else
			{
				System.out.println("Wrong input. Try again.");
			}
		}
		
		// Use CubeIt class constructor to create new CubeIt object and assign its variable
		Cube cubeValue = new Cube(sideLength);
		
		System.out.println("Surface Area: " + cubeValue.surfaceArea());
		System.out.println("Volume: " + cubeValue.volume());
	}
}