package encapsulation;

public class Info {

	private String name;
	private int  id;
	private float salary;
	
	//setters 
	void setName (String n)
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
    //getters
	String getName ()
	{
		return name ;
	}
	int getId ()
	{
		return id;
	}
	float getSalary ()
	{
		return salary;
	}
}
