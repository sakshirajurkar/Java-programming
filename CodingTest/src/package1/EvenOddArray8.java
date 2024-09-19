package package1;

public class EvenOddArray8 {

	public static void main(String[] args) {
		int a[] = {65,98,45,88,97};
		int sumEven = a[0];
		int sumOdd = a[0];
		
		System.out.println("even num below:");
		for(int i=0; i<a.length; i++) {
			if(a[i]%2==0) {
				System.out.println(a[i]);
				sumEven = a[i]+sumEven;
			}
		}
		
		System.out.println("Sum of even num:"+sumEven);
		
		
		System.out.println("odd num below:");
		for(int j=0; j<a.length; j++) {
			if(a[j]%2 !=0) {
				System.out.println(a[j]);
				sumOdd = a[j]+sumOdd;
			}
		}
		System.out.println("Sum of odd num:"+sumOdd);
	}

}
