package Goemetric_Computations;
/**
 * Class for EquilateralTriangle
 * variable base => a
 * variable height => h
 */
public class EquilateralTriangle extends Triangle{
	
	//Observers
	protected double base,height;
	
	//Purpose: Implements an Equilateral Triangle
	public EquilateralTriangle(double a, double h) {
		super(a,a,a,h);
		base=a;
		height=h;	}
		
			//Methods
	//Purpose: To determine the area of the Triangle
	public double area() {
		//EQN Area: Sqrt(3) X .25 X base X height
		return (Math.sqrt(3)*.25*base*height );	}
	}
