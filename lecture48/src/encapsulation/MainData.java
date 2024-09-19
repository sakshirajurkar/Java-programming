package encapsulation;

public class MainData {

	public static void main(String[] args) {
		Data ob = new Data ();
		ob.setName("sakshi");
		ob.setId(101);
		ob.setSalary(24000);
		System.out.println(ob.getName() + " " + ob.getId() + ob.getSalary() + "");
	}

}
