/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
public class Main
{
	static int random(int min,int max) {
		return( (int)min + (int) (Math.random() * (max-min)));
	}

    public static void main(String[] args){
        for(int i=0;i<10;i++){
            System.out.print(random(1,3));
            System.out.print(' ');
        }
    }
}