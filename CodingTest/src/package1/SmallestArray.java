package package1;

public class SmallestArray {

   public static void main(String[] args) {
	   int a[] = {7,4,8,3,5};
	   int small = 0;
	   for(int i=0; i<a.length; i++) {
		   if(small <= a[i]) {
			   small = a[i];
		   }
	   }
	   System.out.println(small);
}

}
