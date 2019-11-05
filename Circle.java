package Goemetric_Computations;
/**
 * Class for Circle
 * variable r => radius
 */
public class Circle extends A_Shape{
	
	public Circle(double side) {
		super();
		// TODO Auto-generated constructor stub
	}
	//Observers
	protected double r;
	
				//Methods
	//Purpose: To determine the area of the Circle
	public double area() {
		//EQN Area: PI x R X R
		return (Math.PI * r * r);	}

	//Purpose: To determine the perimeter of the Circle
	public double perimeter() {
		//EQN Perimeter: PI X r X 2
		return (Math.PI* r * 2);	}

	
	public double sides() {
		// TODO Auto-generated method stub
		return 1;
	}

	
	public boolean isQuadrilateral() {
		// TODO Auto-generated method stub
		return false;
	}

	
	public boolean isTriangle() {
		// TODO Auto-generated method stub
		return false;
	}

	
	public boolean isCircle() {
		// TODO Auto-generated method stub
		return true;
	}
	}

