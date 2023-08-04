package mp5_bcherry;

import java.text.DecimalFormat;

abstract class Container 
{
    protected double height;

    public Container(double height) 
    {
        this.height = height;
    }

    public abstract double calcTopArea();

    public abstract double calcTopPerimeter();

    public double calcVolume() 
    {
        double topArea = calcTopArea();
        return height * topArea;
    }

    public double calcSurfaceArea() 
    {
        double topArea = calcTopArea();
        double topPerimeter = calcTopPerimeter();
        return 2 * topArea + height * topPerimeter;
    }

    public abstract String toString();
}

class CircularContainer extends Container 
{
    private double radius;

    public CircularContainer(double height, double radius) 
    {
        super(height);
        this.radius = radius;
    }

    public double calcTopArea() 
    {
        return Math.PI * radius * radius;
    }
 
    public double calcTopPerimeter() 
    {
        return 2 * Math.PI * radius;
    }
 
    public String toString()
    {
        DecimalFormat decimalFormat = new DecimalFormat("#.00");
        return "Circular Container\n" +
                "Height: " + decimalFormat.format(height) + "\n" +
                "Radius: " + decimalFormat.format(radius) + "\n" +
                "Top Area: " + decimalFormat.format(calcTopArea()) + "\n" +
                "Top Perimeter: " + decimalFormat.format(calcTopPerimeter()) + "\n" +
                "Volume: " + decimalFormat.format(calcVolume()) + "\n" +
                "Surface Area: " + decimalFormat.format(calcSurfaceArea());
    }
}

class RectangularContainer extends Container 
{
    private double width;
    private double length;

    public RectangularContainer(double height, double width, double length) 
    {
        super(height);
        this.width = width;
        this.length = length;
    }

    public double calcTopArea() 
    {
        return width * length;
    }

    public double calcTopPerimeter() 
    {
        return 2 * (width + length);
    }

    public String toString() 
    {
        DecimalFormat decimalFormat = new DecimalFormat("#.00");
        return "Rectangular Container\n" +
                "Height: " + decimalFormat.format(height) + "\n" +
                "Width: " + decimalFormat.format(width) + "\n" +
                "Length: " + decimalFormat.format(length) + "\n" +
                "Top Area: " + decimalFormat.format(calcTopArea()) + "\n" +
                "Top Perimeter: " + decimalFormat.format(calcTopPerimeter()) + "\n" +
                "Volume: " + decimalFormat.format(calcVolume()) + "\n" +
                "Surface Area: " + decimalFormat.format(calcSurfaceArea());
    }
}

class TriangularContainer extends Container 
{
    private double sideA;
    private double sideB;
    private double sideC;

    public TriangularContainer(double height, double sideA, double sideB, double sideC) 
    {
        super(height);
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    public double calcTopArea() 
    {
        double s = (sideA + sideB + sideC) / 2.0;
        return Math.sqrt(s * (s - sideA) * (s - sideB) * (s - sideC));
    }

    public double calcTopPerimeter() 
    {
        return sideA + sideB + sideC;
    }

    public String toString() 
    {
        DecimalFormat decimalFormat = new DecimalFormat("#.00");
        return "Triangular Container\n" +
                "Height: " + decimalFormat.format(height) + "\n" +
                "Side A: " + decimalFormat.format(sideA) + "\n" +
                "Side B: " + decimalFormat.format(sideB) + "\n" +
                "Side C: " + decimalFormat.format(sideC) + "\n" +
                "Top Area: " + decimalFormat.format(calcTopArea()) + "\n" +
                "Top Perimeter: " + decimalFormat.format(calcTopPerimeter()) + "\n" +
                "Volume: " + decimalFormat.format(calcVolume()) + "\n" +
                "Surface Area: " + decimalFormat.format(calcSurfaceArea());
    }
}

class RegularPolygonContainer extends Container 
{
    private double side;
    private int numSides;

    public RegularPolygonContainer(double height, double side, int numSides) 
    {
        super(height);
        this.side = side;
        this.numSides = numSides;
    }

    public double calcTopArea() 
    {
        return numSides * side * side / (4 * Math.tan(Math.PI / numSides));
    }

    public double calcTopPerimeter() 
    {
        return numSides * side;
    }

    public String toString() 
    {
        DecimalFormat decimalFormat = new DecimalFormat("#.00");
        return "Regular Polygon Container\n" +
                "Height: " + decimalFormat.format(height) + "\n" +
                "Side: " + decimalFormat.format(side) + "\n" +
                "Number of Sides: " + numSides + "\n" +
                "Top Area: " + decimalFormat.format(calcTopArea()) + "\n" +
                "Top Perimeter: " + decimalFormat.format(calcTopPerimeter()) + "\n" +
                "Volume: " + decimalFormat.format(calcVolume()) + "\n" +
                "Surface Area: " + decimalFormat.format(calcSurfaceArea());
    }
}

