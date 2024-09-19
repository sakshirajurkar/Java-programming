package Package1;

public class PrimeNum500to1000 {

	public static void main(String[] args) {
		int num = 1000;
		int count = 0;
		for (int i = 500; i <= num; i++) {
			for (int j = 2; j < i; j++) {
				if (num % j == 0) {
					count++;
				}
			}
			if (count == 0) {
				System.out.println(i);
			}
		}
	}
}
