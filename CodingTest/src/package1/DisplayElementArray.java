package package1;

public class DisplayElementArray {

	public static void main(String[] args) {
		int a[] = {32,4,2,43,22,2};
		int num = 22;
		
		for (int i=0; i<a.length; i++)
		{
			if (num==a[i])
			{
				System.out.println("Display element "+ ++i);
			}
		}
	}

}
