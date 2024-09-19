package package1;

public class SumOfDigitsOfNumbersByWhileLoop {
 public static void main(String[] args) {
	int num = 124;
	
	int sum = 0;
	int rem = 0;
	
	while(num>0)
	{
		rem=num%10; //4
		sum=sum+rem; //7 
		num=num/10; //12
		
	}
	System.out.println("value of sum:"+sum);
}
}
