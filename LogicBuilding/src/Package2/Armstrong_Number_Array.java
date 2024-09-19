package Package2;

//find armstrong number of an array
public class Armstrong_Number_Array {

	public static void main(String[] args) {
		int a[] = { 121, 344, 252, 465, 767, 879, 153 };

		for (int i = 0; i < a.length; i++) {
			int rem = 0;
			int temp = a[i];
			int cube = 0;

			while (a[i] > 0) {
				rem = a[i] % 10;
				cube = cube + (rem * rem * rem);
				a[i] = a[i] / 10;
			}
			if (temp == cube) {
				System.out.println(cube);
			}
		}
	}

}
