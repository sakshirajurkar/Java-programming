package Package1;

public class EVEN_ODD_Array {

	public static void main(String[] args) {
		int a[] = {4,3,6,7,2,9,8,1,9};
		int even = 0;
		int odd =0;
		System.out.println("even array");
		for(int i=0; i<a.length; i++) {
			if(a[i]%2==0) {
				System.out.println(a[i]);
				even = even +a[i];
			}
		}
		System.out.println("odd array");
		for(int j=0; j<a.length; j++) {
			if(a[j]%2!=0) {
				System.out.println(a[j]);
				odd=odd+a[j];			}
		}
		System.out.println("sum of even array:"+even);
		System.out.println("sum of odd array:"+odd);

		
	}

}
