
public class VariableArguments {

	public static void main(String[] args) {
		System.out.println(topla(5,6));
		int[] sayilar= {1,2,3,4,5,6,7,8,9,10};
        System.out.println(diziTopla(sayilar));
	}
	public static int topla(int number1,int number2) {
		int toplama=number1+number2;
		return toplama;
	}
	
	public static int diziTopla(int[] sayilar) {
		int toplam=0;
		for(int number:sayilar) {
			toplam+=number;
		}
		return toplam;
		
	}

}
