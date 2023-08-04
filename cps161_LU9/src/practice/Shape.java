package practice;

public abstract class Shape {
	
	public abstract double getArea();
	public abstract double getPerimeter();
	
	public double getRatio() {
		return getArea()/getPerimeter();
	}
	

	
	public static void main(String[] args) {
		Shape[] shapes = new Shape[2];
		shapes[0] = new circle(2);
		shapes[1] = new Rectangle(2, 3);
		
		for (Shape shape : shapes) {
			System.out.println(shape.getRatio());
		}
		
	}
}
