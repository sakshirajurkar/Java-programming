package package1;

public class DisplayElementArray1 {

	public static void main(String[] args) {
		int a[] = {23,43,6,42,54};
		int num = 23;
		
		for (int i=0; i<a.length; i++)
		{
			if (num==a[i])
			{
				System.out.println("display element "+ ++i);
			}
		}
	}

}
