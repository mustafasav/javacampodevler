package javacamp_Week1;

public class stringsDemo {

	public static void main(String[] args) {
		String mesaj = "Bugün hava çok güzel. ";

		System.out.println(mesaj);
		System.out.println("Eleman Sayısı: " + mesaj.length());
		System.out.println("5. Eleman : " + mesaj.charAt(4)); // Belli bir yerdeki tek karakteri alır
		System.out.println(mesaj.concat("Yaşasın")); // Sonuna metin ekler
		System.out.println(mesaj);
		System.out.println(mesaj.startsWith("B")); // Belli bir karakterle başlayıp başlamadığına bakar.(True-False)
		System.out.println(mesaj.endsWith("B")); // Belli bir karakterle bitip bitmediğine bakar.(True-False)
		char[] karakterler = new char[25];
		mesaj.getChars(0, 4, karakterler, 0); // Metin için belli bir bölümü alarak diziye aktarır.
		System.out.println(karakterler);
	}

}
