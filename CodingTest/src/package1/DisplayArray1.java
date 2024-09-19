package package1;

public class DisplayArray1 {

	public static void main(String[] args) {
		int a[] = {12,34,54,67,43,55,45,40,35};
		
		int num = 43;
		for (int i=0; i<a.length; i++) {
			if(a[i]==num) 
			{
				System.out.println("Position "+ ++i);
			}
		}
	}

}
