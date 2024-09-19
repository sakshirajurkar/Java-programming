package package1;

public class GreatestArray8 {

	public static void main(String[] args) {
		int a[] = {76,56,11,54,56};
		int great = a[0];
		for (int i=0; i<a.length; i++)
		{
			if(a[i]>great)
			{
				great = a[i];
			}
		}
		System.out.println(great);
	}
	
}
