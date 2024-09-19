package package1;

public class DisplayArray {

	public static void main(String[] args) {
		int a[] = {12,24,83,64,95};
		int num = 12;
		for(int i=0; i<a.length; i++) {
			if (a[i]==num)
			{
				System.out.println("location of element:"+ ++i);
			}
			
		}
	}

}
