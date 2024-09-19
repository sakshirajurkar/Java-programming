package collection_day3;
import java.util.ArrayList;
import java.util.Iterator;
public class StudentMain {

	public static void main(String[] args) {
		ArrayList <Student> list = new ArrayList<Student>();
		Student s1 = new Student ("Anjali", 102);
		Student s2 = new Student ("Ankita", 103);
		Student s3 = new Student ("Ravi", 104);
		Student s4 = new Student ("Rajat", 107);
		Student s5 = new Student ("Avantika", 108);
		
		list.add(s5);
		list.add(s3);
		list.add(s1);
		list.add(s2);
		list.add(s2);
		
		for (int i=0; i<list.size(); i++)
		{
			System.out.println(list.get(i).getName() + " " + list.get(i).getId());
		}
		
	}

}
