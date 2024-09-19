package package1;

public class MainEmployeeEncapsulation {

	String name;
	int id ;
	float salary;
	
	void setName(String s)
	{
		name = s;
	}
	void setId(int i)
	{
		id = i;
	}
	void setSalary(float f)
	{
		salary = f;
	}
	String getName()
	{
		return name;
	}
	int getId()
	{
		return id;
	}
	float getSalary()
	{
		return salary;
	}
}
