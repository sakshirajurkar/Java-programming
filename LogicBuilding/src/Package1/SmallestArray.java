package Package1;

public class SmallestArray {

	public static void main(String[] args) {
         int a[] = {3,4,3,6,4,7,8};
         int small =a[0];
         
         for(int i=0; i<a.length; i++) {
        	 if(a[i]<small) {
        		 small=a[i];
        	 }
         }
         System.out.println(small);
	}

}
