package Package1;

public class Max_Array_Elemenent {

	public static void main(String[] args) {
		int a[] = {6,8,4,3,9,5,1,2};
		int max =0;
		
		for(int i=0; i<a.length; i++) {
			if(a[i]>max) {
               max = a[i];
			}
		}
		System.out.println(max);
	}

}
