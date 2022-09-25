package homeWork;

public class EnBuyuk {

	public static void main(String[] args) {
		
		
		int[] sayilar= {18,28,21};
		int enBuyuk= sayilar[0];
		int i=0;
		
		while(i<sayilar.length) {
			if(sayilar[i+1]>enBuyuk) {
				enBuyuk=sayilar[i+1];
				System.out.println("En Buyuk Sayi="+sayilar[i+1]);
			}
			i++;
		}
	}

}
