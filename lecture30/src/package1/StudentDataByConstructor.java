package package1;

public class StudentDataByConstructor {
	//instance varibale
	String name;
	int rollNo;
	char grade;
	float percent;
	//default contructor
	public StudentDataByConstructor(String a, int b, char c, float d )
	{	
		name = a;
		rollNo = b;
		grade = c;
		percent = d;
	}
	
	//method
	void Student()
	{
		System.out.println(name+" "+rollNo+" "+grade+" "+percent);
	}

	public static void main(String[] args) {
		
		StudentDataByConstructor st1 = new StudentDataByConstructor("Pritam  ",  01,  'A',    65.09f);
		st1.Student();
     	StudentDataByConstructor st2 = new StudentDataByConstructor("Aryan   ",  02,  'B',    76.5f);
     	st2.Student();
		StudentDataByConstructor st3 = new StudentDataByConstructor("Devansh ",  03,  'A',    87.43f);
		st3.Student();
		StudentDataByConstructor st4 = new StudentDataByConstructor("Shiva   ",  04,  'B',    96.65f);
		st4.Student();
		StudentDataByConstructor st5 = new StudentDataByConstructor("Vedant  ",  05,  'A',    86.35f);
		st5.Student();
		
		
	}
 
}
