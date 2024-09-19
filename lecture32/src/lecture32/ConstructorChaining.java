package lecture32;
public class ConstructorChaining {
	String name;
	int id;
	float marks;
	boolean result;
	
	ConstructorChaining()
	{
		this("Ananya");
		name = null;
		id=0;
		marks=0.0f;
	    result = false;
		System.out.println("This is an zero parameter constructor");
		
	}
	ConstructorChaining(String s)
	{
		this("Ravi",101);
		System.out.println("This is an one parameter constructor");
		
	}
	ConstructorChaining(String s, int i)
	{
		this("Kavya",102,50.9f);
		System.out.println("This is an two parameter constructor");
	}
	ConstructorChaining(String s, int i, float f)
	{
		this("kiara",103,70.9f,false);
		System.out.println("This is an three parameter constructor");
	}
	ConstructorChaining(String s, int i, float f, boolean b)
	{
		System.out.println("This is an four parameter constructor");
	}
	
	
	

	public static void main(String[] args) {
		ConstructorChaining ob = new ConstructorChaining();
		
	}
}
