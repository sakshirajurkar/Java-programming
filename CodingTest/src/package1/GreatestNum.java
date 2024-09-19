package package1;

public class GreatestNum {

	public static void main(String[] args) {
		int a[] = {6,3,4,2,56,};
		int great = a[0];
		
		for (int i=0; i<a.length; i++)
		{
			if (great<a[i])
			{
				great = a[i];
			}
		}
		System.out.println("greates num "+great);
		
	}

}
