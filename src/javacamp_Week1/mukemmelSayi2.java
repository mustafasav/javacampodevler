package javacamp_Week1;

public class mukemmelSayi2 {

	public static void main(String[] args) {

		long nereyeKadar = 1000;

		long total = 0;

		for (long i = 1; i <= nereyeKadar; i++) {

			for (long j = 1; j < i; j++) {

				if (i % j == 0) {
					total += j;
				}

			}

			if (total == i) {
				System.out.println(i);

			}
			total = 0;

		}

		System.out.println("Program Sonu!!!");

	}

}
