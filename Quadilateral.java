package Goemetric_Computations;
/**
 * Abstract Class for Quadilaterals
 * variable l => length
 * variable w => width
 */
public abstract class Quadilateral implements IGeometry {
	
	//Observers
	protected double l,w;
		
	//Purpose: Implements a Quadilateral
	public Quadilateral(double length, double width) {
		l=length; 
		w=width;	}
	
				//Methods
	//Purpose: To determine the area of the Quadilateral
	public double area() {
		//EQN Area: length X width
		return (l * w);	}
	
	//Purpose: To determine the perimeter of the Quadilateral
	public double perimeter() {
		//EQN Perimeter: (length X 2) + (width X 2)
		return ((l*2)+(w*2));	}	
}
