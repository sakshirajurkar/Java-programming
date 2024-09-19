package package1;

public class Polymorphism {
	String name;
	int age;
	String email;

	public void setData(String name, int age) {
		this.name = name;
		this.age = age;
		
	}
	public void setData(String name, int age, String email)
	{
		this.name = name;
		this.age = age;
		this.email=email;
	}

	public void display() {
		System.out.println(name);
		System.out.println(age);
		System.out.println(email);
	}

	public static void main(String[] args) {
		Polymorphism ob = new Polymorphism();
		ob.setData("Teena", 20);
		Polymorphism ob2 = new Polymorphism();
		ob.setData("Reena", 21, "reenaxyz@gmail.com");
		ob.display();

	}

}
