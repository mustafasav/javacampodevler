package javacamp_Week1;

public class arkadasSayilar3 {

	public static void main(String[] args) {
		/*
		 * Programın amacı belli bir limite kadar olan arkadaş sayıları bulmaktadır.
		 * Döngünün üst sınırları arttıkça sonucu bulması biraz daha zorlaşıp zaman
		 * almaktadır.
		 */ //
		boolean varMi = false;
		for (int i = 1; i < 300; i++) {
			for (int j = 1; j < 300; j++) {
				if (i != j) {
					if (bolenToplamlari(i) == j && bolenToplamlari(j) == i) {
						System.out.println(i + " - " + j + " Arkadaş sayılardır!!!");
						varMi = true;
					}
				}
			}
		}
		if (varMi != true) {
			System.out.println("Belirlenen sınırda arkadaş sayı bulunamamıştır!!!");
		}

		System.out.println("Program Sonu!!!");
	}

	public static int bolenToplamlari(int number) {
		int total = 0;
		for (int i = 1; i < number; i++) {
			if (number % i == 0) {
				total += i;
			}
		}
		return total;
	}

}
