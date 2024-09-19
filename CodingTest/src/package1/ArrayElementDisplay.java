package package1;

public class ArrayElementDisplay {

	public static void main(String[] args) {
		int a[] = {10,20,30,40,50};
		int num = 40;
		
		for (int i=0; i<a.length; i++) {
			if (num==a[i])
			{
				System.out.println("position "+ ++i);
			}
		}
	}

}
