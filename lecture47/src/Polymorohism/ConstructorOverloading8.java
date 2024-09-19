package Polymorohism;
class W 
{
	W ()
	{
		System.out.println("0- args constructor");
	}
    W(int a)
    {
    	System.out.println("1- args constructor");
    }
    W (int a, int b )
    {
    	System.out.println("3- args constructor");
    }
 }
public class ConstructorOverloading8 {

	public static void main(String[] args) {
		W ob = new W();
		W  ob1 = new W(1);
		W  ob2 = new W (2,4);
		
	}

}
