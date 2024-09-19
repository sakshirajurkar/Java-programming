package package1;

public class GreatestNumArray2 {

	public static void main(String[] args) {
		int a[] = {3,5,2,7,4,6};
		int great = a[0];
		
		for (int i=0; i<a.length; i++)
		{
			if (a[i]>great)
			{
				great = a[i];
			}
		}
		System.out.println("greatest num: "+great);
	}

}
