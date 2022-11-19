package javacamp_Week1;

public class stringsDemo {

	public static void main(String[] args) {
		String mesaj = "Bugün hava çok güzel.";
		System.out.println(mesaj);

		// Eleman(karakter) sayısını bulmak
		System.out.println(mesaj);
		System.out.println("Eleman Sayısı: " + mesaj.length());

		// Belli bir yerdeki tek karakteri almak
		System.out.println("5. Eleman : " + mesaj.charAt(4));

		// Sonuna metin eklemek
		System.out.println(mesaj.concat("Yaşasın"));

		System.out.println(mesaj);

		// Belli bir karakterle başlayıp başlamadığını kontrol etmek.(True-False)
		System.out.println(mesaj.startsWith("B"));

		// Belli bir karakterle bitip bitmediğini kontrol etmek (True-False)
		System.out.println(mesaj.endsWith("B"));

		// Metin için belli bir bölümü alarak diziye aktarmak.
		char[] karakterler = new char[25];
		mesaj.getChars(0, 4, karakterler, 0);
		System.out.println(karakterler);

		// Karakteri aramak amaçlı. (baştan)
		System.out.println(mesaj.indexOf('v'));

		// Metni aramak amaçlıdır. (baştan)
		System.out.println(mesaj.indexOf("gü"));

		// Metni tersten aramak amaçlıdır.
		System.out.println(mesaj.lastIndexOf("gü"));

//Karakter değiştirmek
		String yeniMesaj = mesaj.replace(" ", "-");
		System.out.println(yeniMesaj);

		// // 3. karakterden sonuna kadar al
		System.out.println(mesaj.substring(3));

		// 3 ile 8 arası metni al (8 dahil değil)
		System.out.println(mesaj.substring(3, 10));

		// String ifadeyi belli bir karaktere göre bölmek.
		for (String kelime : mesaj.split(" ")) {
			System.out.println(kelime);
		}

		// String ifadeyi küçük harfe çevirmek
		System.out.println(mesaj.toLowerCase());

		// String ifadeyi büyük harfe çevirmek
		System.out.println(mesaj.toUpperCase());

		// başındaki sonundaki boşlukları atmak amaçlıdır.
		System.out.println(mesaj.trim());

	}

}
