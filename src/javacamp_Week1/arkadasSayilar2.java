package javacamp_Week1;

public class arkadasSayilar2 {

	public static void main(String[] args) {
		int sayi1 = 225;
		int sayi2 = 284;

		if (bolenToplamlari(sayi1) == sayi2 && bolenToplamlari(sayi2) == sayi1) {
			System.out.println("Arkadaş sayılardır!!!");
		} else {
			System.out.println("Arkadaş sayı değildir!!!");
		}

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
