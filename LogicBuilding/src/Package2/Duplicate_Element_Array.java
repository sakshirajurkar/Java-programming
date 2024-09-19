package Package2;

//Find duplicate element is an array
public class Duplicate_Element_Array {

	public static void main(String[] args) {
		int a[] = { 3, 5,7, 8, 4, 7, 5, 8 };
		int dup = 0;

		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] == a[j]) {
					System.out.println(a[j]);
				}
			}
		}
	}

}
