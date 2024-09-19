package package1;

public class GreatestNumArray1 {

	public static void main(String[] args) {
		int a[] = {12,34,21,44,98};
		int great =a[0];
		
		for (int i=0; i<a.length; i++)
		{
			if (a[i]>great)
			{
				great = a[i];
				
			}
		}
		System.out.println("greatest array element "+ great);
		
	}

}
