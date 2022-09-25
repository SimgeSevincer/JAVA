package homeWork;

public class AsalSayi {

	public static void main(String[] args) {
		boolean durum=true;
		for(int i=2;i<101;i++) {
			durum=true;
			for(int y=2;y<i;y++) {
				if(i%y==0) {
					durum=false;
					break;
				}
			}
			if(durum==true) {
				System.out.println(i);
			}
		}
	}
}
