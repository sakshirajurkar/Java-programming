package package1;

public class GreatestNumArray3 {

	public static void main(String[] args) {
		int a[] = {12,786,32,55,32};
		int great = a[0];
		
		for (int i=0; i<a.length; i++)
		{
			if (great<a[i])
			{
				great = a[i];
			}
		}
		System.out.println("greatest num "+ great);
	}

}
