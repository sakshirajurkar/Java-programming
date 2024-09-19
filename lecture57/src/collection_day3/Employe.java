package collection_day3;

public class Employe {
	 String name;
	 float salary;
	   
	 public Employe (String s, float f)
	 {
		 name = s;
		 salary = f;
	 }

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return name + " " + salary;
	}
	 

}
