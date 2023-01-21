public class Circle
{
    private int radius;
    public Circle(int radius) 
    {
		this.radius = radius;
	}
	public double area()
	{
		return Math.PI * Math.pow(this.radius, 2);
	}
	public String toString() 
	{
		return("Circle with radius = " + String.valueOf(this.radius));
	}
	
}