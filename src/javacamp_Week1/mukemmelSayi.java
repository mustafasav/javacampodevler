package javacamp_Week1;

public class mukemmelSayi {

	public static void main(String[] args) {
		int number = 33550336;
		int total = 0;
		for (int i = 1; i < number; i++) {

			if (number % i == 0) {
				total += i;
			}

		}

		if (total == number) {
			System.out.println("Sayı Mükemmeldir.");
		} else {
			System.out.println("Sayı Mükemmel Değildir.");
		}

	}

}
