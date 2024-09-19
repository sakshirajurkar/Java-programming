package OOPS;

class A3 	{
	float salary;
	int id;
	String name;
	void m1 (float f) {
	    salary = f;
	}
	void m1(float f, int i) {
		salary = f;
		id = i;
	}
	void m1(float f, int i, String s ) {
		salary = f;
		id = i;
		name = s;
	}
}
public class MethodOverloading {

	public static void main(String[] args) {
		A3 ob = new A3();
		ob.id=(54);
		ob.name=("krishna");
		ob.salary = (64.76f);
		System.out.println("salary:" + ob.salary + "name:" +ob.name + " id:"+ ob.id );
	}
	
}
