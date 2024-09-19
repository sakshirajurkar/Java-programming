package Package1;

public class Armstrong_Num8 {

	public static void main(String[] args) {
		int a[] =  {153,132,165,188,237,193};
		
		for(int i=0; i<a.length; i++) {
			int rem =0;
			int cube =0;
			int temp = a[i];
			while(a[i]!=0) {
				rem = a[i]%10;
				cube = cube +(rem*rem*rem);
				a[i] = a[i]/10;
			}
			if(cube == temp) {
				System.out.println(temp+"is an armstrong no");
			}
		}
	}

}
