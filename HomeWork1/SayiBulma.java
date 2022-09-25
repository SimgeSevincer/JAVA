package homeWork;

public class SayiBulma {

	public static void main(String[] args) {
		int[] number= {1,2,3,4,5};
		int aranacak=5;
		boolean durum=false;
		for(int sayi:number) {
			if(sayi==aranacak) {
				durum=true;
				break;
			}

		}
		if(durum==true) {
			System.out.println("Sayi bulundu");
		}
		else {
			System.out.println("Sayi bulunamadı");
		}

}
}