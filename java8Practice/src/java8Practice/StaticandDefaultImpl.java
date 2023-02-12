package java8Practice;

public class StaticandDefaultImpl implements StaticandDefault {

	private float side;
	public StaticandDefaultImpl(float s) {
	 this.side = s;
	}
	@Override
	public float calculateArea() {
		return side*side;
	}
	
	public static void main(String[] args) {
		StaticandDefault obj = new StaticandDefaultImpl(10.5f);	
		StaticandDefault.printArea(obj.calculateArea());
		obj.printShapeType("Square");
	}

}
