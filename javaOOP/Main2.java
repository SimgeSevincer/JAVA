import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		System.out.print("Speed => ");
		Scanner input = new Scanner(System.in);
		int speed = input.nextInt();
		Bicycle bicycle1 = new Bicycle(speed);
		System.out.println(bicycle1.toString());
	}
}