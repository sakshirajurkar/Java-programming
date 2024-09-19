package collection_day3;

public class Student {
     private String name;
     private int id;
     
     public Student(String s, int i)
     {
    	 this.name = s;
    	 this.id = i;
     }

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return name + "- " + id;
	}
     

}
