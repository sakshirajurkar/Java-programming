package Package1;

public class EvenOddSumArray {

	public static void main(String[] args) {
		int a[] = {2,5,6,4,8,3};
		int odd = 0 ;
		int even =0;
		for(int i=0; i<a.length; i++) {
			if(a[i]%2==0) {
				System.out.println("even:"+a[i]);
				even = even + a[i];
			}
			else {
				System.out.println("odd:"+a[i]);
				odd = odd+a[i];
				
			}

		}
		System.out.println("sum of even numbers:"+even);
		System.out.println("sum of odd numbers:"+odd);
	}

}
