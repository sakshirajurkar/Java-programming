package package1;

public class EmployeeClassCollectionMain {
	String name;
	int rollNo;
	EmployeeClassCollectionMain (String s, int i )
	{
		name = s;
		rollNo = i;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	@Override
	public String toString() {
		return name + " " + rollNo;
	}
	
	

}
