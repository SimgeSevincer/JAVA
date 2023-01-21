import java.util.Scanner;

public class Main
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter an integer and Return => ");
		int height = input.nextInt();
		int width = input.nextInt();
		Rectangle rectangle1 = new Rectangle(height,width);
		System.out.println("You have created a " + rectangle1.toString() + ".");
		System.out.println("it's area equals " + rectangle1.area() + ".");
		input.close();
	}
}