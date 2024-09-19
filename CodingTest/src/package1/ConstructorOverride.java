package package1;
class I 
{
	I()
	{
		System.out.println("calling cons I");
	}
}
class II extends I
{
	II()
	{
		System.out.println("calling cons II");
	}
}

public class ConstructorOverride {

	public static void main(String[] args) {
		II ob = new II ();
		
	}

}
