package package1;

public class TypesOfMethod2 {
	//type 2

	void oddNum(int num)
	{
		
		{
			if(num%2!=0)
			{
				System.out.println("num is odd");
			}
			else 
			{
				System.out.println("num is not odd");
			}
		}
	}	
	public static void main(String[] args) {
		TypesOfMethod2 ob = new TypesOfMethod2();
		ob.oddNum(7);
	}
	}
