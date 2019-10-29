package Goemetric_Computations;
/**
 * Class for Rhombus
 * variable length => l
 * variable angle => a
 */
public class Rhombus extends Quadilateral{
	
	//Observers
	protected double a, l;
	
	//Purpose: Implements a Rectangle
	public Rhombus(double length, double angle) {
		super(length,length);
		l = length;
		a = angle;		}

				//Methods
	//Purpose: To determine the area of the Rectangle
	public double area() {
		//EQN Area: l X l X sin(a)
		return (l * l * Math.sin(a));	}
	}
