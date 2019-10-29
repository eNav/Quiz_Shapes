package Goemetric_Computations;
/**
 * Class for Circle
 * variable r => radius
 */
public class Circle implements IGeometry{
	
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
	}
