package Goemetric_Computations;
//Tests
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
//JUnit Test File
class Geometric_tests {

	@Test
	void Quadilaterals() {
		Square A = new Square(4);
		Rectangle B = new Rectangle(4,5);
		Rhombus C = new Rhombus(2,46);
		
		assertEquals(A.area(), 16);
		assertEquals(B.area(), 20);
		assertEquals(C.area(), 3.6, 0.1);
				
		assertEquals(A.perimeter(), 16);
		assertEquals(B.perimeter(), 18);
		assertEquals(C.perimeter(), 8);}
		
	@Test
	void Triangles() {
		EquilateralTriangle A = new EquilateralTriangle(4,5);
		IsoscelesTriangle B = new IsoscelesTriangle(7,3,6);
		ScaleneTriangle C = new ScaleneTriangle(5,6,3,3);
		
		assertEquals(A.area(), 8.7, 0.1);
		assertEquals(B.area(), 9);
		assertEquals(C.area(), 9);
		
		assertEquals(A.perimeter(), 12);
		assertEquals(B.perimeter(), 17);
		assertEquals(C.perimeter(), 14);		
	}
	
	@Test
	void Circle() {
		Circle A = new Circle(4);
		
		assertEquals(A.area(),50.3, 0.1);
		assertEquals(A.perimeter(), 25.1, 0.1);
	}

}
