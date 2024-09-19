package encapsulation;

public class Data {

	private String name ;
	private int id ;
	private float salary;
	
	void setName(String n)
	{
		name = n;
	}
	void setId (int i)
	{
		id = i;
	}
	void setSalary (float f)
	{
		salary = f;
	}
	//getter
	
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
