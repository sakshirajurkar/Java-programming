package package1;

public class AscedingArray {

	public static void main(String[] args) {
		int a[] = {54,76,24,86,89};
		int count = 0;
		for (int i=0; i<a.length; i++ )
		{
			while (a[i] > count )
			{
				System.out.println(a[i]);
			}
		}
		
		
	}
  //24 54 76 86 89
}
