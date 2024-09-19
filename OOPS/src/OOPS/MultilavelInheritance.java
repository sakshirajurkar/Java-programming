package OOPS;
class emplyoye
{
	String name;
	int id;
}
class manager extends emplyoye
{
	String name1;
	int id1;
}
class HR extends manager 
{
	String name2;
	int id2;
	void m1()
	{
		System.out.println(name + "- " + id );
		System.out.println(name1 + "- " + id1 );
		System.out.println(name2 + "- " + id2 );
	}
}
public class MultilavelInheritance {

	public static void main(String[] args) {
		HR ob = new HR();
		ob.name= ("Anish");
		ob.id = (102);
		ob.name1 = ("Kaivalya");
		ob.id1 = (104);
		ob.name2 = ("Rushikesh");
		ob.id2 = (106);
		ob.m1();
	}

}
