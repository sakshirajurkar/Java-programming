package package1;
class cons1
{
	 cons1()
	{
		System.out.println("this is an cons1");
	}
}
class cons2 extends cons1
{
	cons2()
	{
		System.out.println("this is an cons2");
	}
}

public class ConstructorOverride {

	
     public static void main(String[] args) {
	  cons2 ob = new cons2();
     }	
}
