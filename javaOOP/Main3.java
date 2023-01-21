import java.util.Scanner;
public class Main extends Object
{
	public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(new java.io.File("input.txt"));
        Enemy e1= new Enemy('1');
        Enemy e2=new Enemy('2');
        while(input.hasNextInt()){
            //int x=input.nextInt();
            //System.out.println(x);
            System.out.println(input.nextInt()+" "+
                               input.nextInt());
        }
	}
}