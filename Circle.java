package Goemetric_Computations;
/**
 * Class for Circle
 * variable r => radius
 */
public class Circle extends aShape{
	
	//Observers
	protected double r;
	
	//Purpose: Implements a Circle
	public Circle(double radius) {
		r=radius;		}
	
				//Methods
	//Purpose: To determine the area of the Circle
	public double area() {
		//EQN Area: PI x R X R
		return (Math.PI * r * r);	}

	//Purpose: To determine the perimeter of the Circle
	public double perimeter() {
		//EQN Perimeter: PI X r X 2
		return (Math.PI* r * 2);	}
	
	//Purpose: To determine the number of sides in this shape
	public double sides() {
		return 1;	}

	//Purpose: To determine if shape is a Qudilateral
	public boolean isQuadrilateral() {
		return false;	}

	//Purpose: To determine if shape is a Triangle
	public boolean isTriangle() {
		return false;}

	//Purpose: To determine if shape is a Circle
	public boolean isCircle() {
		return true;	}
	
	}
