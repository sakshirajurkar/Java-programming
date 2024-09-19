package package1;
public class PrimeNumByWhileLoop {
	public static void main(String[] args) {
		int count = 0;
		int num = 7;
		int i=2;

		while (i!=num) {
			if(num%i==0)
			{
				count++;
			}
			i++;
		}
		if (count > 0) {
			System.out.println("not prime");
		} 
		else {
			System.out.println("prime");
		}

	}
}
