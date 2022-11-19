package javacamp_Week1;

public class sesliHarfler {

	public static void main(String[] args) {
		String metin = "Ö";

		/*
		 * Önce metni büyük harfe çeviriyoruz. Caselerde büyük küçük harf atlamasın
		 * diye. Eğer bunu yapmazsak caselere küçük-büyük harf hepsini kontrol
		 * ettirmeliyiz.
		 */

		metin = metin.toUpperCase();

		// Stringi char a çevirelim.
		char harf = metin.charAt(0);

		switch (harf) {
		case 'A':
		case 'I':
		case 'U':
		case 'O':
			System.out.println("Kalın Sesli Bir Harf");
			break;
		case 'E':
		case 'İ':
		case 'Ü':
		case 'Ö':
			System.out.println("İnce Sesli Bir Harf");
			break;

		default:
			System.out.println("Sesli bir harf girilmedi!!!");
			break;
		}

	}

}
