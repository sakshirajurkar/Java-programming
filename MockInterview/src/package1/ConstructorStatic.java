package package1;

public class ConstructorStatic {
    
	public static void main(String[] args) {
		int rem = 0;
		int num = 102;
		int temp = num;
		int sum =0;
		
		while (num>0)
		{
			rem = rem % 10;
			sum = (sum *10)/rem;
			num = num / 10;
		}
		System.out.println(num);
		
		if (temp == num)
		{
			System.out.println("pallindrom");
		}
		else
		{
			System.out.println("not pallibdrom");
		}
	}

}
