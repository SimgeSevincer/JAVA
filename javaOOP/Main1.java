import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) throws IOException
	{
		Scanner input = new Scanner(System.in);
		PrintWriter writer = new PrintWriter(new File("input.txt"));
		int radius;
		for ( int i = 0; i < 1; i++ )
		{
            System.out.print("Radius => ");
            radius = input.nextInt();
    		writer.println(radius);
		}
		writer.close();
		Scanner infile = new Scanner(new File("input.txt"));
		radius = infile.nextInt();
		Circle circle = new Circle(radius);
		System.out.println(circle.area());
		infile.close();
	}
}