package package1;

public class SamallestNum {

	public static void main(String[] args) {
		int a[] = {2,9,5,8,4};
		int num = a[0];
		
		for (int i=0; i<a.length; i++)
		{
			if (a[i]<num)
			{
				num = a[i];
			}
		}
		System.out.println(num);
	}

}
