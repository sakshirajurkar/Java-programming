package package1;

public class PallindromNumByWhileLoop1 {
  public static void main(String[] args) {
	int num = 232;
	
	int rem = 0;
	int reverse = 0;
	int temp=num;
	
	
	while(num>0);
	{
		rem= num%10;
		reverse = (reverse*10)+rem;
		
	}
	if(reverse==temp)

	{
		System.out.println(temp+"is a pallindrom num");
		
	}
	else 
	{
		System.out.println("not pallindrom");
	}
}
}



