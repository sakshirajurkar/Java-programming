package package1;

public class SamallestElementArray {

	public static void main(String[] args) {
		int a[] = {2,6,5,9};
		int num = a[0];
		for (int i =0; i<a.length; i++)
		{
			
			if(a[i]<num)
			{
				 num =a[i];
			}
			
	    }
		System.out.println(num);
		
	}

}
