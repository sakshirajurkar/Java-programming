package lecture31;

public class ConstructorChaining1 {
	int x;
	
	 ConstructorChaining1 ()
	 {
		 this(12,98);
		 int a = 5;
		 System.out.println("this is zero para. cons.");
	 }
	 ConstructorChaining1 (int a)
	 {
		 this(6,5);
	 }
	 
	 ConstructorChaining1 (int a, int b)
	 {
		 this(2,3,4);
		 System.out.println("this is two para. cons.");
	 }
	 ConstructorChaining1 (int a, int b, int c)
	 {
		 System.out.println("this is three para. cons.");
	 }

	public static void main(String[] args) {
		 ConstructorChaining1 ob = new  ConstructorChaining1 (12);
		
	}

}
