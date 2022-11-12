package javacamp_Week1;

public class loopDemo {

	public static void main(String[] args) {

		// For Döngüsü
		for (int i = 1; i <= 10; i++) {
			System.out.println("i: " + i);
		}
		System.out.println("----Döngü Sonu----");
		for (int j = 1; j <= 10; j += 2) {
			System.out.println("j: " + j);
		}
		System.out.println("----For Döngü Sonu----");

		// while: Önce şarta bakar sonra döngüye bakar. Şart sağlanmıyorsa döngü hiç
		// çalışmaz.
		int i = 1;
		while (i < 10) {
			System.out.println(i);
			i += 2;
		}
		System.out.println("----While Döngü Sonu----");

		// Do-While: Önce döngüyü girer sonra şarta bakar.
		// Şart sağlanmasa bile en az bir kere çalışır.
		int j = 1;
		do {
			System.out.println(j);
			j += 2;
		} while (j < 10);
		System.out.println("----Do-While Döngü Sonu----");
	}

}
