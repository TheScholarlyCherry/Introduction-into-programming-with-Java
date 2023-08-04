package cps161_lu8;

public class Rectangle {

	private int width;
	private int height;
	private Point topLeftPoint;
	
	
	
	public Rectangle(int width, int height, Point topLeftPoint) 
	{
		super();
		this.width = width;
		this.height = height;
		this.topLeftPoint = topLeftPoint;
	}
	
	public Point getTopRightPoint() 
	{
		return new Point(topLeftPoint.getX()+ width,
				topLeftPoint.getY());
	}
	
	public Point getBottomLeftPoint() 
	{
		return new Point(topLeftPoint.getX(),
				topLeftPoint.getY()- height);
	}
	
	public Point getBottomRightPoint() 
	{
		return new Point(topLeftPoint.getX()+ width,
				topLeftPoint.getY()- height);
	}
	public boolean isOverlapping(Rectangle rect) 
	{
		return isInside(rect.getTopLeftPoint()) || isInside(rect.getTopRightPoint())
		||isInside(rect.getBottomLeftPoint()) || isInside(rect.getBottomRightPoint())
		||
		(rect.isInside(topLeftPoint) || rect.isInside(getTopRightPoint())
		|| rect.isInside(getBottomLeftPoint())|| rect.isInside(getBottomRightPoint()));
	}
	public boolean isInside(Point point)
	{
		return (point.getX() >= topLeftPoint.getX() && point.getX() < getTopRightPoint().getX())
		&&
		(point.getY()>=getBottomLeftPoint().getY() && point.getY() <= topLeftPoint.getY());
	}
		
	public int getWidth() 
	{
		return width;
	}
	public void setWidth(int width) 
	{
		this.width = width;
	}
	public int getHeight() 
	{
		return height;
	}
	public void setHeight(int height) 
	{
		this.height = height;
	}
	public Point getTopLeftPoint() 
	{
		return topLeftPoint;
	}
	public void setTopLeftPoint(Point topLeftPoint) 
	{
		this.topLeftPoint = topLeftPoint;
	}
	@Override
	public String toString() 
	{
		return "Rectangle [width=" + width + ", height=" + height + ", topLeftPoint=" + topLeftPoint + "]";
	}
	

}
