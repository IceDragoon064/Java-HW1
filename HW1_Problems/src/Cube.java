
/**
 * This is HW1, Problem 2
 * @author Leon Lu
 * Project Due Date: May 3, 2022 (Tuesday)
 * This class will calculate surface area and volume
 */

public class Cube
{
	private double sideLength;
	
	/**
	 * Constructor 
	 * @param sideLength
	 */
	public Cube(double sideLength)
	{
		this.sideLength = sideLength;
	}
	
	/**
	 * surfaceArea method to calculate surface area of the cube
	 * Formula: SA = 6 * side length ^ 2
	 * @return the value of saCube using instance variable sideLength
	 */
	public double surfaceArea()
	{
		double saCube = 6 * Math.pow(this.sideLength,2);
		return saCube;

	}
	
	/**
	 * This method calculates the volume of the cube
	 * using instance variable sideLength
	 * Formula: V = side length ^ 3 
	 * @return the value of volumeCube
	 */
	public double volume()
	{
		double volumeCube = Math.pow(this.sideLength,3);
		return volumeCube;
	}
}