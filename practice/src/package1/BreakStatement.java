package package1;

public class BreakStatement {
	public static void main(String[] args) {
		for(int num=5; num<=10; num++)
		{
			if(num==7)
			{
				break;
			}
			System.out.println(num);
		}
	}
}