package Goemetric_Computations;
/**
 * Class for Rhombus
 * variable length => l
 * variable angle => a
 */
public class Rhombus extends A_Quadrilateral{
	
	//Observers
	protected double a, l;
	
	//Purpose: Implements a Rectangle
	public Rhombus(double length, double angle) {
		super(length,length);
		l = length;
		a = angle;		
		}

	}
