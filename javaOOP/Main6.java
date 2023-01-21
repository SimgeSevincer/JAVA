import java.util.Scanner;
public class Main extends Object
{
	public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(new java.io.File("input.txt"));
        Enemy e1 = new Enemy('1');
        Enemy e2 = new Enemy('2');
        while ( input.hasNextInt() ) {
            int x=input.nextInt();
            int y=input.nextInt();
            e1.setPosition(x);
            e2.setPosition(y);
            if (x==y+2){
                e1.setTotal();
            }
            if (y==x+2){
                e2.setTotal();
            }
        }
        System.out.println("1. runner's position = " + String.valueOf(e1.getPosition()));
        System.out.println("2. runner's position = " + String.valueOf(e2.getPosition()));

        if ( e1.getPosition() > e2.getPosition() )
            System.out.println("1. runner wins!!!");
        else if ( e1.getPosition() < e2.getPosition() )
            System.out.println("2. runner wins!!!");
        else
            System.out.println("They are even!");            
	}
}


