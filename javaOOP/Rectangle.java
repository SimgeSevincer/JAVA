public class Rectangle extends Object
{
    private int height;
    private int width;
    public Rectangle (int height, int width)
    {
        this.height = height;
        this.width = width;
    }
    public int getHeight() // getter
	{
		return(this.height);
	}
	public int getWidth() // getter
	{
		return(this.width);
	}
	public void setHeight(int height) // setter
	{
		this.height = height;
	}
	public void getWidth(int width)// setter
	{
		this.width = width;
	}
	public int area() // service method
	{
		return(this.height * this.width);
	}
	public String toString() 
	{
		return("Rectangle with height = " + String.valueOf(this.height) + "Rectangle with width = "  + String.valueOf(this.width)); // type casting
	}

}
