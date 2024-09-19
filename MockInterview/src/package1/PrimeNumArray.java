package package1;

public class PrimeNumArray {

	public static void main(String[] args) {
		int a[] = {76,87,56,46,98};
		int count=0;
		
		for(int j=0; j<a.length; j++) {
		
		for(int i=2; i<a[j]; i++) {
			if(a[i]%i==0) {
				count++;
			}
		}
			if(count>0) {
				System.out.println(a[j]);
			}
		}
	}

}
