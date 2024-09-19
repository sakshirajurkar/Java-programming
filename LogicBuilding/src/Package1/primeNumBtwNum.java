package Package1;

public class primeNumBtwNum {

	public static void main(String[] args) {
		int num = 300;
		int count = 0;
		for (int i = 100; i <= num; i++) {
			for (int j = 2; j < i; j++) {
				if (num % j == 0) {
					count++;
				}
			}
			if (count == 0) {
				System.out.println(count);
			}
		}
	}

}
