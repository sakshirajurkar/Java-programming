package package1;

public class IfElseIfStatement2 {
    public static void main(String[] args) {
		int a = 3;
		int b = 2;
		int c = 6;
		
		if ((a<b)&&(a<c))
		{
			System.out.println(a + " is smallest number ");
		}
		else if ((b<a)&&(b<c))
		{
			System.out.println(b + " is smallest number ");
		}
		if ((c<a)&&(c<b))
		{
			System.out.println(c + " is smallest number ");
		}
		
	}
}
