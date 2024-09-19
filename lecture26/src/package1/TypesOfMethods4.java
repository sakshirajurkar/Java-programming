package package1;

public class TypesOfMethods4 {
	
	//type 4 

	int lessNum(int num1, int num2 )
	{	
		if (num1<num2)
		{
			return num1;
		}
		else
		{
			return num2;
		}
	}
	
	
	
	
	public static void main(String[] args) {
		TypesOfMethods4 ob = new TypesOfMethods4();
		int x = ob.lessNum(5,0);
		System.out.println(x + " is less num ");
	}
}
