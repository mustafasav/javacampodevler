package javacamp_Week1;

public class sayiBulma {

	public static void main(String[] args) {
		int[] sayilar = new int[] { 1, 2, 5, 7, 9, 0, 3 };
		int aranacakSayi = 5;
		boolean varMi = false;

		for (int sayi : sayilar) {
			if (sayi == aranacakSayi) {
				varMi = true;
				break;
			}
		}

		if (varMi) {
			System.out.println("Sayı bulundu!!!");
		} else {
			System.out.println("sayı bulunamadı!!!");
		}

	}

}
