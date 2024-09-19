package Polymorohism;
class X   //parent constructor   //construcot can not override 
{
	X ()
	{
		System.out.println("X cons. calling");
	}
}
class Y extends X 
{
	Y ()
	{
		System.out.println("Y cons. calling");
	}
}
public class ParentOverriding {

	public static void main(String[] args) {
		Y ob = new Y();
	}

}
