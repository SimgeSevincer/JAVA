import java.util.Scanner;//karakter okumak için yazılmalı
public class Main
{
	public static void main(String[] args) throws Exception//dosya okuma varsa yazılmalı throws ile başlayan yer{
		System.out.println("Hello World");
		int x;
		x=5;
		Scanner input= new Scanner(new java.io.File("input.txt"))//dosya okuma varsa yazılmalıdır.new ile başlayan yer;
	    x=input.nextInt();
	    System.out.println("x=>"+String.valueOf(x));//methodlar her zaman küççük yazılır.
	    input.close;
	    //scope yapısı ve blok yapısı
	    
	    
	}
}
