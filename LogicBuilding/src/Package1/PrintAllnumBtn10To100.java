package Package1;

//print sum of all odd num between 10-100 and which  greater num 50;
public class PrintAllnumBtn10To100 {

	public static void main(String[] args) {
		int sum =0;
		for(int i=10; i<=100; i++) {
			if(i%2!=0) {
				for(int j=50; j<=100; j++) {
				     sum = sum +j;
				}
			}
		}
		System.out.println("sum of odd num:"+sum);
	}

}
