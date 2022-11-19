package javacamp_Week1;

public class sesliHarfler2 {

	public static void main(String[] args) {

		char karakter = 'ö';

		String mesaj = "Sesli bir harf girmediniz!!!";

		char[] inceSesli = { 'e', 'E', 'i', 'İ', 'ö', 'Ö', 'ü', 'Ü' };
		char[] kalinSesli = { 'a', 'A', 'ı', 'I', 'o', 'O', 'u', 'U' };

		for (char harf : inceSesli) {
			if (harf == karakter) {
				// mesaj = "İnce sesli bir harf!!!";
				System.out.println("İnce sesli bir harf!!!");
				return;// içinde bulunduğun sınıfı bitir.
			}
		}

		for (char harf : kalinSesli) {
			if (harf == karakter) {
				mesaj = "kalın sesli bir harf!!!";
			}
		}

		System.out.println(mesaj);

	}

}
