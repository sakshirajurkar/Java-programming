package Package1;

public class StarPattern2 {

	public static void main(String[] args) {
		int num = 8;
		for (int i = 0; i < num; i++) {
			for (int j = 0; j <= i; j++) {
				if (i <= j) {
					System.out.print(" ");
				} else {
					System.out.println("* ");
				}
			}

		}
		System.out.println(" ");
	}
}
/*
            *
           **
          ***
         ****
        *****
*/