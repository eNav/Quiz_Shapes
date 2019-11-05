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
		Rhombus C = new Rhombus(20,10);
		
		assertEquals(A.area(), 16);
		assertEquals(B.area(), 20);
		assertEquals(C.area(), 200);
				
		assertEquals(A.perimeter(), 16);
		assertEquals(B.perimeter(), 18);
		assertEquals(C.perimeter(), 60);
	
		assertEquals(A.isQuadrilateral(), true);
		assertEquals(B.isQuadrilateral(), true);
		assertEquals(B.isQuadrilateral(), true);
		
		assertEquals(A.isTriangle(), false);
		assertEquals(B.isTriangle(), false);
		assertEquals(C.isTriangle(), false);
		
		assertEquals(A.isCircle(), false);
		assertEquals(B.isCircle(), false);
		assertEquals(C.isCircle(), false);
		
		assertEquals(A.sides(), 4);
		assertEquals(B.sides(), 4);
		assertEquals(C.sides(), 4);
	}
		
	@Test
	void Triangles() {
		EquilateralTriangle A = new EquilateralTriangle(4,5);
		IsoscelesTriangle B = new IsoscelesTriangle(7,3,6);
		ScaleneTriangle C = new ScaleneTriangle(5,6,3,3);
		
		assertEquals(A.area(), 10);
		assertEquals(B.area(), 9);
		assertEquals(C.area(), 9);
		
		assertEquals(A.perimeter(), 12);
		assertEquals(B.perimeter(), 17);
		assertEquals(C.perimeter(), 14);	
		
		assertEquals(A.isQuadrilateral(), false);
		assertEquals(B.isQuadrilateral(), false);
		assertEquals(B.isQuadrilateral(), false);
		
		assertEquals(A.isTriangle(), true);
		assertEquals(B.isTriangle(), true);
		assertEquals(C.isTriangle(), true);
		
		assertEquals(A.isCircle(), false);
		assertEquals(B.isCircle(), false);
		assertEquals(C.isCircle(), false);
		
		assertEquals(A.sides(), 3);
		assertEquals(B.sides(), 3);
		assertEquals(C.sides(), 3);
	}
	
	@Test
	void Circle() {
		Circle A = new Circle(4);
		
		assertEquals(A.area(),50.3, 0.1);
		assertEquals(A.perimeter(), 25.1, 0.1);
		
		assertEquals(A.isQuadrilateral(), false);
		
		assertEquals(A.isTriangle(), false);
				
		assertEquals(A.isCircle(), true);
			
		assertEquals(A.sides(), 1);
		
	}

}
