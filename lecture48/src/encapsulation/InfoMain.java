package encapsulation;

public class InfoMain {

	public static void main(String[] args) {
		Info ob = new Info ();
		ob.setName("Krishna");
		ob.setId(101);
		ob.setSalary(24000);
		System.out.println(ob.getName() + " " + ob.getId() + " " + ob.getSalary() + " ");
	}

}
