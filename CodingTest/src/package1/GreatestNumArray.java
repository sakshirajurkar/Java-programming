package package1;

public class GreatestNumArray {

	public static void main(String[] args) {
		int a[] = {1,2,3,4,5};
		int great = a[0];
		
		for (int i=0; i<a.length; i++) {
			if(a[i]>great)
			{
			great = a[i];
			}
		}
		System.out.println("Greatest num "+great );
	}

}
