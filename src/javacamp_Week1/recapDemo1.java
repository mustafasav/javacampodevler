package javacamp_Week1;

public class recapDemo1 {

	public static void main(String[] args) {
		int number1 = 200;
		int number2 = 250;
		int number3 = 30;

		int enBuyuk = number1;
		int enKucuk = number1;

		// En Büyük Sayıyı Buldurma
		if (number2 > enBuyuk) {
			enBuyuk = number2;
		}
		if (number3 > enBuyuk) {
			enBuyuk = number3;
		}

		// En Küçük Sayıyı Buldurma
		if (number2 < enKucuk) {
			enKucuk = number2;
		}
		if (number3 < enKucuk) {
			enKucuk = number3;
		}

		System.out.println("En Büyük Sayı: " + enBuyuk);
		System.out.println("En Küçük Sayı: " + enKucuk);

	}

}
