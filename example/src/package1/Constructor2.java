package package1;

public class Constructor2 {
	 public Constructor2 () //default cons
	 {
		 System.out.println("Constructor Running");
	 }
	 public  Constructor2 (int a) //parameterized cons
	 {
		 System.out.println("Constructor Running "+a);
	 }
	public static void main(String[] args) {
		Constructor2 ob = new Constructor2();
		Constructor2 ob1 = new Constructor2(4);
	}

}
