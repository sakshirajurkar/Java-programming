package package1;

public class StudentCollectionByUsingContructor {
	//instance variable
	String name;
	float fees;
	char section;
	int rollNo;
	
	//default condtructor
	public StudentCollectionByUsingContructor(String n, float f, char c, int b)
	{
		name = n;
		fees = f;
		section = c;
		rollNo = b;		
				
		
	}
	//method
	void student()
	{
		System.out.println(name+""+fees+""+section+""+rollNo);
	}

	public static void main(String[] args) {
		StudentCollectionByUsingContructor ob1 = new StudentCollectionByUsingContructor("Aryan ", 43000f, 'A', 01);
		ob1.student();
		StudentCollectionByUsingContructor ob2 = new StudentCollectionByUsingContructor("Pritam ", 65000, 'B', 02);
		ob2.student();
		StudentCollectionByUsingContructor ob3 = new StudentCollectionByUsingContructor("Vedant ", 97000, 'C', 03);
		ob3.student();
		StudentCollectionByUsingContructor ob4 = new StudentCollectionByUsingContructor("Aditya ", 54000, 'D', 04);
		ob4.student();
		StudentCollectionByUsingContructor ob5 = new StudentCollectionByUsingContructor("Devansh ", 6599f, 'E', 05);
		ob5.student();
		StudentCollectionByUsingContructor ob6 = new StudentCollectionByUsingContructor("Shiva ", 6530f, 'F', 06);
		ob6.student();
		StudentCollectionByUsingContructor ob7 = new StudentCollectionByUsingContructor("Vaibhav ", 7576f, 'G', 07);
		ob7.student();





		
		
	}
}
