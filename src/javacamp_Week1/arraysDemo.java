package javacamp_Week1;

public class arraysDemo {

	public static void main(String[] args) {
		String ogrenci1 = "Mustafa";
		String ogrenci2 = "Emine";
		String ogrenci3 = "Deniz";

		String[] ogrenciler = new String[3];
		ogrenciler[0] = "Mustafa";
		ogrenciler[1] = "Emine";
		ogrenciler[2] = "Deniz";

		for (int i = 0; i < ogrenciler.length; i++) {
			System.out.println(ogrenciler[i]);
		}
		System.out.println("-------------");
		for (String ogrenci : ogrenciler) {
			System.out.println(ogrenci);
		}

	}

}
