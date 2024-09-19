package Package2;
//find pallindrom number of an array
public class Pallindrom_NumFrom_Array {

	public static void main(String[] args) {
		int a[] = { 121, 344, 252, 465, 767, 879 };

		for (int i = 0; i < a.length; i++) {
			int rem = 0;
			int sum = 0;
			int temp = a[i];

			while (a[i]> 0) {
				rem = a[i] % 10;
				sum = (sum * 10) + rem;
				a[i] = a[i] / 10;
			}
			if (temp == sum) {
				System.out.println(sum);
			}
		}
	}
}
