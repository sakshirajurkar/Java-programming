package package1;

public class DisplayArrayElement {

	public static void main(String[] args) {
		int a[] = {12,13,14,15,16};
		int num = 14;
		
		for(int i=0; i<a.length; i++) {
			if(num==a[i])
			{
				System.out.println("position: "+ ++i);
			}
		}
	}
}
