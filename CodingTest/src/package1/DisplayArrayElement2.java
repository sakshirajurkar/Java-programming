package package1;

public class DisplayArrayElement2 {

	public static void main(String[] args) {
		int a[] = {23,45,87,89};
		int num = 45;
		
		for (int i=0; i<a.length; i++)
		{
			if (a[i]==num)
			{
				System.out.println("display element "+ ++i);
			}
		}
	}

}
