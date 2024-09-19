package Package2;

public class Even_Odd_Array_And_Sum {

	public static void main(String[] args) {
		int a[] = { 3, 5, 9, 8, 4, 6, 1 };
		int evenSum = 0;
		int oddSum = 0;
		int sum = 0;
		System.out.println("even num:");
		for (int i = 0; i < a.length; i++) {
			if (a[i] % 2 == 0) {
				evenSum = a[i]+evenSum;			}
		}
		System.out.println(evenSum);
		System.out.println("odd num:");
		for (int j = 0; j < a.length; j++) {
			if (a[j] % 2 != 0) {
				oddSum = a[j]+oddSum;
			}
		}
		System.out.println(oddSum);

	}

}
