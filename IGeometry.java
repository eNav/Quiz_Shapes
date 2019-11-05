package Goemetric_Computations;

/**
 * Interface for all Geometric Shapes
 *IGeometry
 */
public interface IGeometry {
	public double area();
	//Determines area of Geometric shape
	public double perimeter();
	//Determines perimeter of Geometric shape
	public double sides();
	//Determines the sides of a Geometric shape
	public boolean isQuadrilateral(); 
	
	public boolean isTriangle();
	
	public boolean isCircle();
	

}
