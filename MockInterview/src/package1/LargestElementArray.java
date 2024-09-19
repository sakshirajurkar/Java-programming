package package1;

public class LargestElementArray {

	public static void main(String[] args) {
		int a[] = {54,87,45,23,56};
		int great = a[0];
		
		for(int i=0; i<a.length; i++)
		{
			if(a[i]>great)
			{
				great = a[i];
			}
		}
		System.out.println(great);
	}

}
