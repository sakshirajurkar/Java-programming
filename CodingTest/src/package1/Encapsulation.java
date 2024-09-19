package package1;

public class Encapsulation {

	private String name;
	private int id;
	private float salary ;
	
	//setter
	void setName (String n)
	{
		name = n;
	}
	void setId(int i)
	{
		id = i;
	}
	void setSalary (float f)
	{
		salary = f;
	}
	//getter
     String getName ()
     {
    	 return name;
     }
     int getId()
     {
    	 return id;
     }
     float getSalary ()
     {
    	 return salary;
     }
     
}
