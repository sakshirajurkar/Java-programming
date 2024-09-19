package OOPS;
class engineer
{
	String name;
	int id;
	float salary;
	char grade;
	
	engineer (String n)
	{
		name = n;
		System.out.println("1- args parameter");
	}
	engineer (String n, int i)
	{
		name = n;
		id = i;
		System.out.println("2- args parameter");
	}
	engineer (String n, int i, float f)
	{
		name = n;
		id = i;
		salary = f;
		System.out.println("3- args parameter");
	}
	engineer (String n, int i, float f, char g)
	{
		name = n;
		id = i;
		salary = f;
		grade = g;
		System.out.println("4- args parameter");
	}
}
public class ConstructorOverloading {

	public static void main(String[] args) {
		engineer ob = new engineer ("Sakshi");
		engineer ob1 = new engineer ("Sakshi",101);
		engineer ob2 = new engineer ("Sakshi",101,240000);
		engineer ob3 = new engineer ("Sakshi",101,240000,'A');
		
		
		
	}

}
