package package1;

public class DisplayArrayElement4 {

	public static void main(String[] args) {
		int a[] = {1,90,23,65,18};
		int num = 90;
		
		for (int i=0; i<a.length; i++)
		{
			if (num == a[i])
			{
				System.out.println("display element "+ ++i);
			}
		}
	}

}
