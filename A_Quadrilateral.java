package Goemetric_Computations;
/**
 * Abstract Class for Quadilaterals
 * variable l => length
 * variable w => width
 */
public abstract class A_Quadrilateral extends A_Shape {
	
	//Observers
	protected double length;
		
	//Purpose: Implements a Quadrilateral
	public A_Quadrilateral(double length, double side) {
		this.side = side; 
		this.length = length;}
	
				//Methods
	//Purpose: To determine the area of the Quadilateral
	public double area() {
		//EQN Area: length X width
		return (side * length);	}
	
	//Purpose: To determine the perimeter of the Quadilateral
	public double perimeter() {
		//EQN Perimeter: (length X 2) + (width X 2)
		return ((side*2)+(length*2));	}

	@Override
	public double sides() {
		// TODO Auto-generated method stub
		return 4;
	}

	@Override
	public boolean isQuadrilateral() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isTriangle() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isCircle() {
		// TODO Auto-generated method stub
		return false;
	}	 

}
