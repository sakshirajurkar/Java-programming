package Package1;

public class PrimeNum {

	public static void main(String[] args) {
		int num = 5;
		int count = 0;
		
		for(int i=2; i<num; i++) {  
			if(num % i !=0) {        
				count++;
			}
		}
		if(count==0) {
			System.out.println("prime num");
		}
		else {
			System.out.println("not prime num");
		}
	}
}

/* i=2; 
 * num=20;
 * count =0;
 * i=2 
 * i<num 2<20 = true
 * num % i=0 20 % 2=0 
 * 
 * 
 * 
 * 
 * 
 */
