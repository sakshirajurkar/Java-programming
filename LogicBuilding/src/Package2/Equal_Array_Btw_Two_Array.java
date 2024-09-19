package Package2;

public class Equal_Array_Btw_Two_Array {

	public static void main(String[] args) {
		int a[] = {3,4,5,6,7,8,2};
	    int b[] = {4,6,8,3,9,2,10};
	    
	    for(int i=0; i<a.length; i++) {
	    	for(int j=0; j<b.length; j++) {
	    		if(a[i]==b[j]) {
	    			System.out.println(a[i]);
	    		}
	    	}
	    }
	}

}
