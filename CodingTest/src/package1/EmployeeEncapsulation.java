package package1;

public class EmployeeEncapsulation {

	public static void main(String[] args) {
		MainEmployeeEncapsulation ob = new MainEmployeeEncapsulation();
		ob.name = ("Sakshi");
		ob.id = (102);
		ob.salary= (240000.10f);
		System.out.println(ob.getName() + " " + ob.getId()+ " " + ob.getSalary());
	}

}
