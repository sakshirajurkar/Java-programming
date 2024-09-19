package package1;

public class GreatestArrayNum {

	public static void main(String[] args) {
		int a[] = {1,5,3,8,6,9};
		int great = a[0];
		
		for (int i=0; i<a.length; i++)
		{
			if (great <a[i])
			{
				great = a[i];
			}
		}
		System.out.println("greatest num: "+ great);
		
	}

}
