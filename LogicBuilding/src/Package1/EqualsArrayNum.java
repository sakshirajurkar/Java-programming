package Package1;
// equal num in array
public class EqualsArrayNum {

	public static void main(String[] args) {
		int a[] = { 2, 8, 5, 7, 4, 6 };
		int b[] = { 10, 8, 9, 3, 7, 4 };

		for (int i = 0; i < a.length; i++) {
			int equal = a[0];
			for (int j = 0; j < b.length; j++) {
				if (a[i] == b[j]) {
					equal = a[i];
					equal = b[j];
					System.out.println(equal);
				}
			}
		}
	}

}
