package Package2;

public class Prime_Num_Array {

	public static void main(String[] args) {
		int a[] = {5,7,3,9,6,54,87,556,875,352,873,65,4,8,76,459,34,24};
	
		for(int i=0; i<a.length; i++) {
			int count =0;
			for(int j=2; j<i; j++) {
				if(a[i]%j==0) {
					count++;
				}
			}
			if(count>0) {
				System.out.println(a[i]);
			}
		}
		
		
	}

}
