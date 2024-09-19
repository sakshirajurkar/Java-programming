package Package1;

public class PallindromNumArray {

	public static void main(String[] args) {
		int a[] = { 404, 102, 999, 548, 101 };
		for (int i = 0; i < a.length; i++) {
			int rem = 0;
			int temp = a[i];
			int div = 0;
			while (a[i] > 0) {
				rem = rem % 10;
				div = (div * 10) + rem;
				a[i] = a[i] / 10;
			}
			if (div == temp) {
				System.out.println("pallindrom num" + a[i]);
			}

		}

	}

}
