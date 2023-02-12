package java8Practice;

public interface StaticandDefault {

	float calculateArea();
	static void printArea(float res) {
		System.out.println("Area: "+res);
	}
	
	default void printShapeType(String type) {
		
		System.out.println("Shape: "+type);
	}
}
