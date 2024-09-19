package lecture31;

public class StudentDetailByConstructor {
	//Instance variable

	String name;
	int id;
	float marks;
	boolean result;
	
	//Parameterzied Constructor
	 StudentDetailByConstructor(String s) //one Parameterzied
	 {
		 name = s;
	 }
	 StudentDetailByConstructor(String s, int i) // two Parameterzied
	 {
		 name = s;
		 id = i;
		 
		 
	 }
	 StudentDetailByConstructor(String s, int i, float f) //three Parameterzied
	 {
		 name = s;
		 id = i;
		 marks =f;
	 }
	 StudentDetailByConstructor(String s, int i, float f, boolean b) // four Parameterzied
	 {
		 name =s;
		 id = i;
		 marks = f;
		 result = b;
	 }
	 //method
	 void  student()
	 {
		 System.out.println(name+"  "+id+"  "+marks+"  "+result);
	 }
	
	
	
	public static void main(String[] args) {
		
		 StudentDetailByConstructor sc = new  StudentDetailByConstructor("Anuja");
		 sc.student();
		 
		 StudentDetailByConstructor sc1 = new  StudentDetailByConstructor("Priti",120);
         sc1.student();		 
         
         StudentDetailByConstructor sc2 = new  StudentDetailByConstructor("Krishna",123,870);
         sc2.student();
         
         StudentDetailByConstructor sc3 = new  StudentDetailByConstructor("Kat",124,920,true);
         sc3.student();
		
	}

}
