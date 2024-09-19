package package1;

public class DisplayArrayElement1 {

	public static void main(String[] args) {
		int a[] = {11,22,33,44};
		int num = 22;
		
		for (int i=0; i<a.length; i++) {
			if (num==a[i])
			{
				System.out.println("display element " + ++i);
			}
		}
		
	}

}
