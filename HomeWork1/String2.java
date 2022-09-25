package homeWork;

public class String2 {

	public static void main(String[] args) {
		String mesaj="Seni seviyorum sevdiceğim";
		System.out.println(mesaj);
		
		System.out.println("Eleman Sayısı:"+mesaj.length());
		System.out.println("5.eleman:"+mesaj.charAt(5));
		System.out.println(mesaj.concat(" BİRDANEMM"));
		System.out.println(mesaj.startsWith("S"));
		System.out.println(mesaj);
		System.out.println(mesaj.endsWith("m"));
		System.out.println(mesaj.indexOf("evi"));
		System.out.println(mesaj.lastIndexOf("e"));
		System.out.println(mesaj.replace(' ','-'));
		System.out.println(mesaj.substring(2,5));
		
		
		for(String kelime:mesaj.split(" ")) {
			System.out.println(kelime);
		}
		
		System.out.println(mesaj.toLowerCase());
		System.out.println(mesaj.toUpperCase());
		System.out.println(mesaj.trim());//dizenin her iki ucundaki boslugu kaldirir.

	}

}
