package javacamp_Week1;

public class multiDimensionalArray {

	public static void main(String[] args) {
		String[][] yemekler = new String[3][3];
		yemekler[0][0] = "Pide";
		yemekler[0][1] = "Köfte";
		yemekler[0][2] = "Lahmacun";
		yemekler[1][0] = "Ayran";
		yemekler[1][1] = "Kola";
		yemekler[1][2] = "Meyve Suyu";
		yemekler[2][0] = "Revani";
		yemekler[2][1] = "Helva";
		yemekler[2][2] = "Baklava";

		// Hücreleri Tek Tek Dolaşmak İçin
		for (int satir = 0; satir <= 2; satir++) {
			for (int sutun = 0; sutun <= 2; sutun++) {
				System.out.println(yemekler[satir][sutun]);

			}
			System.out.println("--------------");
		}
		System.out.println("--------------");

		// Aynı türleri yanyana yazmak için. Önce satırı dolaş sonra altta in.
		for (int satir = 0; satir <= 2; satir++) {
			for (int sutun = 0; sutun <= 2; sutun++) {
				System.out.print("-" + yemekler[satir][sutun] + "-");
			}
			System.out.println("");

		}

		System.out.println("--------------");
		// Önce sütunları dolaşmak için. Yazdırırken satırla sütunun yerini değiştirdim.
		for (int satir = 0; satir <= 2; satir++) {
			for (int sutun = 0; sutun <= 2; sutun++) {
				System.out.print("-" + yemekler[sutun][satir] + "-");
			}
			System.out.println("");

		}

	}

}
