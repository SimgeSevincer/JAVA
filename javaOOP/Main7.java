public class Main
{
	public static void main(String[] args) {
	    Random r=new Random('a','z');
	    for(int i=0;i<10;i++){
	        char randomLowerLetter=r.randomLowerLetter('a','z');
		    System.out.print(randomLowerLetter);
		    System.out.print(' ');
		    
	    }
		//char randomLowerLetter=r.randomLowerLetter(A,Z);
		//System.out.print(randomUpperLetter);
	}
}
