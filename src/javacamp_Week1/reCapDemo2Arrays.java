package javacamp_Week1;

public class reCapDemo2Arrays {

	public static void main(String[] args) {
		double[] myList = new double[4];
		double[] myList2 = { 1.2, 1.3, 5.6, 5.4 };

		double total = 0;
		double max = myList2[0];
		double min = myList2[0];

		for (double number : myList2) {
			if (max < number) {
				max = number;
			}
			if (min > number) {
				min = number;
			}
			total += number;
			System.out.println(number);
		}
		System.out.println("Toplam: " + total);
		System.out.println("En Büyük: " + max);
		System.out.println("En Küçük: " + min);

	}

}
