package package1;

public class WhileLoop {
   public static void main(String[] args) {
	int sum = 0;
	int n = 456;
	int rem = 0;
	
	while(n>0)
	{
		rem = n%10;
		sum = sum+ rem;
		n = n/10;
	}
	System.out.println("The sum of digits of a number is "+sum);
	}
}

