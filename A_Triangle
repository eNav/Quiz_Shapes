package Goemetric_Computations;
/**
 * Abstract Class for Triangles
 * variable a => left side
 * variable b => base
 * variable c => right side
 * variable h => height
 */
public abstract class A_Triangle  extends A_Shape{

	//Observers
	protected double a,b,c,h;
	
	//Purpose: Implements a Triangle
	public A_Triangle(double sideA, double sideB, double sideC, double height) {
		a = sideA;
		b = sideB;
		c = sideC;
		h = height;	}
	
				//Methods
	//Purpose: To determine the area of the Triangle
	public double area() {
		//EQN Area: .5 X base X height
		return (.5 * b * h);	}
	
	//Purpose: To determine the perimeter of the Triangle
	public double perimeter() {
		//EQN Perimeter: leftside + base + rightside
		return (a+b+c);	}

	@Override
	public double sides() {
		// TODO Auto-generated method stub
		return 3;
	}

	@Override
	public boolean isQuadrilateral() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isTriangle() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isCircle() {
		// TODO Auto-generated method stub
		return false;
	}
}
