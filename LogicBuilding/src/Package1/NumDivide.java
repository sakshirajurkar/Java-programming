package Package1;

public class NumDivide {

	public static void main(String[] args) {
		int num = 21;
		
		for(int i=2; i<num; i++) {
			if(num/i == 0) {
				System.out.println(i);
			}
		}
	}
}
