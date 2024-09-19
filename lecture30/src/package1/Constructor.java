package package1;

public class Constructor {
	//instance variable
	String name;
	float salary;
	
	//default constructor
	   public Constructor(String n,  float f)
	{
		 name=n;
	     salary=f;
		
	}
	   //method
	   void employe()
		{
			System.out.println(name+" "+salary);
		}

	public static void main(String[] args) {
		
		 Constructor ob1 = new  Constructor("Sakshi",20000);
		 ob1.employe();
		 Constructor ob2 = new  Constructor("Lata", 40000);
		 ob2.employe();
		 
		 
		
	}

}
