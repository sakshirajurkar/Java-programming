package package1;

public class Employee {
	
	//instance variable
	String name;
	float salary;
	
	//default condtructor
	  public Employee(String n, float f)
	  {
		  name = n;
		  salary = f;
	  }
	
	  
	//method
	 void data()
	 {
		System.out.println(name+""+salary);
	 }
	
	
	public static void main(String[] args) {
		 Employee ob1 = new  Employee("Vaibhav ",30000f);
		 ob1.data();
		 Employee ob2 = new Employee("Aditya ",43000f);
		 ob2.data();
		 
		
		
	}

}
