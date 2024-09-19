package encapsulation;

public class StudentDetailMain {

	public static void main(String[] args) {
		StudentData ob = new StudentData();
		ob.setName("Raha");
		ob.setId(27000);
		ob.setFees(102);
		ob.setGrade('B');
		System.out.println(ob.getName() + " " + ob.getFees() + " " + ob.getId() + " " + ob.getGrade());
	}
}
