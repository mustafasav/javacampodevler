package javacamp_Week1;

public class miniProjeSayiAsalMi {

	public static void main(String[] args) {
		int sayi = 111;
		int kalan = 0;
		String mesaj = sayi + " sayısı asaldır.";

		if (sayi < 2) {
			mesaj = "Asal sayılar 2'den başlar.";
		} else {

			for (int i = 2; i < sayi; i++) {

				kalan = sayi % i;
				if (kalan == 0) {
					mesaj = "Sayı asal değildir. " + i + " sayısına kalansız bölünmektedir.";
					break; // İçinde bulunduğun bloğu sonlandır.
				}
			}
		}

		System.out.println(mesaj);

	}

}
