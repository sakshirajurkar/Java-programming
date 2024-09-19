package OOPS;
class doctor 
{
	String name;
	float salary;
	int id;
	char grade;
	
	void m1 (String n)
	{
		name = n;
	}
	void m1(String n, float f )
	{
		name =n;
		salary=f;
	}
	void m1(String n, float f, int i)
	{
		name = n;
		salary = f;
		id = i;
	}
	void m1(String n, float f, int i, char c)
	{
		name = n;
		salary = f;
		id = i;
		grade = c;
	}
}

public class MethodOverloding {

	public static void main(String[] args) {
		doctor ob = new doctor();
		ob.name = ("Ravi");
		ob.id  = (101);
		ob.salary = (50000.76f);
		ob.grade = ('A');
		System.out.println("Name:"+ob.name + "   " + "id:" + ob.id + "   "  +"grade:" + ob.grade + "   "  + "salary:" + ob.salary);
	}

}
