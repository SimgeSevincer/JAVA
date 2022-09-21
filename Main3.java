package intrro;

public class Main3 {

	public static void main(String[] args) {
		System.out.println("Hello world!");
		String ortaMetin="İlginizi çekebilir";
		String altMetin="Vade süresi";
		
		//değişken isimleri javada camelcase ile yazılır..
		System.out.println(ortaMetin);
		
		//integer
		int vade = 12;
		double dolarDun = 18.15;
		double dolarBugun =18.10;
		boolean  dolarDustuMu = true;
		String okYonu = "";//empty (bos veri)
		
		if(dolarDun<dolarBugun) {
			okYonu = "down.svg";
			System.out.println(okYonu);
		}
		else if(dolarDun>dolarBugun)
		{
			okYonu = "up.svg";
			System.out.println(okYonu);
		}
		else {
			okYonu = "equal.svg";
			System.out.println(okYonu);
			
		}
		
		//array
		String[] krediler = {"Hızlı Kredi", "Maasını Halkbanktan","Mutlu Emekli"};
		
		for(int i = 0; i < krediler.length; i++) {
			System.out.println(krediler[i]);
		}


	}

}
