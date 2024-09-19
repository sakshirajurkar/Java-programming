package package1;
public class WhileLoop {
     public static void main(String[] args) {
		int num = 11;
		int count = 0;
		int i = 2;
		while (i <= num) {
			count++;
		}
		if (count > 0)
        {
			System.out.println("Num is prime");
		} else {
			System.out.println("Num is not prime");
		}
    }
}
