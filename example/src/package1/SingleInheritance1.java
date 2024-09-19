package package1;
class vehical
{
	String vehicalType;
}
class model extends vehical
{
	String modelType;
	void m1 ()
	{
		System.out.println(modelType + " " + vehicalType);
	}
}

public class SingleInheritance1 {

	public static void main(String[] args) {
		model ob = new model ();
		ob.vehicalType = ("SportsCar");
		ob.modelType = ("Car");
		ob.m1();
	}

}
