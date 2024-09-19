package Package1;

public class DisplayPositionArray {

	public static void main(String[] args) {
		int a[] = { 6, 4, 8, 2, 9, 5 };
		int show = 2;

		for (int i = 0; i < a.length; i++) {
			if (a[i] == show) {
				System.out.println("position: " + ++i);
			}
		}
	}
}
