package package1;

public class PallindromNum {

	public static void main(String[] args) {
		int num = 234;
		int temp = num;
		int rem = 0;
		int reverse = 0;
		
		while(num>0)
		{
			rem = num%10; //4 //3 //2
			reverse = reverse * 10 + rem; //4 //43 //432
			num = num/10; //23 /2 //0
		}
		if (reverse == temp )
		{
			System.out.println("pallindrom");
		}
		else
		{
			System.out.println("not pallindrom");
		}
		System.out.println(num);
		
	}

}
