package javacamp_Week1;

public class switchDemo {

	public static void main(String[] args) {
		char grade = 'F';

		switch (grade) {

		// Birden fazla değere aynı sonucu döndürmek için caseler alt alt yazılır.
		case 'A':
		case 'a':
			System.out.println("Pekiyi");
			break;
		case 'B':
		case 'b':
			System.out.println("İyi");
			break;
		case 'C':
			System.out.println(" Orta");
			break;
		case 'D':
			System.out.println("Geçer");
			break;
		case 'F':
		case 'f':
			System.out.println("Kaldınız.");
			break;
		default:
			System.out.println("Geçersiz Not Girişi!!!");
		}

	}

}
