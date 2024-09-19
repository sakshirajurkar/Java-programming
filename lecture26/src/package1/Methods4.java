package package1;

public class Methods4 {
	//Methods with no return type but with arguments
	//type-2
	void sub(int n1, int n2)
	{
		int result= n1-n2; 
		System.out.println(result);
	}

   public static void main(String[] args) {
	   Methods4 t2 = new Methods4 ();
	   t2.sub (4,9);
	
}

}
