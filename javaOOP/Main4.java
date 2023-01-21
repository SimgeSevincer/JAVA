
public class Main
{
	public static void main(String[] args) {
		Random r=new Random(1,3);
		for(int i=0;i<20;i++){
		    int randomDigit=r.randomDigit(1,3);
		    System.out.print(randomDigit);
		    System.out.print(' ');
		}
		//char randomLowerLetter=r.randomLowerLetter();
		//System.out.print(randomLowerLetter)
		//char randomLowerLetter=r.randomLowerLetter();
		//System.out.print(randomUpperLetter)
	}
}
