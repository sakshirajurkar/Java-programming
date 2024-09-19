package package1;

public class AddOperation {
	   int add_int(int x, int y)
	   {
		   return x + y;
	   }

	public static void main(String[] args) {
		 AddOperation ob = new  AddOperation();
		 int z = ob.add_int(2,4);
		 System.out.println(z);
	}
}
