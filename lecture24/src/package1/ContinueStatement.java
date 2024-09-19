package package1;

public class ContinueStatement {
 public static void main(String[] args) {
	for(int num=1; num<=5; num++)
	{
		if(num==3)
		{
			continue;
		}
		System.out.println(num);
	}
}
}
