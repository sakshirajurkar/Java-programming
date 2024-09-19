package encapsulation;

public class InformationMain {

	public static void main(String[] args) {
		Information ob = new Information();
		ob.setName("Raja");
		ob.setId(101);
		ob.setFees(24000);
		ob.setGrade('A');
		System.out.println(ob.getName() + " " + ob.getId() + " " + ob.getFees() + " " + ob.getGrade()+ "  ");
	}
}
