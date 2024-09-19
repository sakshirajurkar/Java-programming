package Package1;

public class Btw100To300PrimeNum {

	public static void main(String[] args) {
		int num = 300;
		int count = 0;
		for (int i = 100; i <= num; i++) {   // 100<=300 true

			for (int j = 2; j < i; j++) {    // 2<300 = true
				if (i % j == 0) {            // 2%300==0
					count++;
				}
			}
			if (count == 0) {
				System.out.println(i);
			}

		}
	}
}
