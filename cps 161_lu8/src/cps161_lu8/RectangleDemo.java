package cps161_lu8;

public class RectangleDemo {

	public static void main(String[] args) {
		
		Rectangle rect = new Rectangle(5, 3, new Point(1,1) );
		
		System.out.println(rect);
		System.out.println(rect);
		System.out.println("bottom left: " + rect.getBottomLeftPoint());
		System.out.println("bottom right: " + rect.getBottomRightPoint());
		System.out.println("top right: " + rect.getTopRightPoint());
		Rectangle rect2 = new Rectangle(2, 4, new Point(7,3));
		System.out.println(rect.isOverlapping(rect2));
		Rectangle rect3 = new Rectangle(2,10,new Point(5,3));
		System.out.println(rect.isOverlapping(rect3));

	}

}
