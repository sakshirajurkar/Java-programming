package package1;

public class GreatestArray1 {

	public static void main(String[] args) {
		int a[] ={ 6,8,3,5,4};
		int great = 0;
		for(int i=0; i<a.length; i++) {
			if(a[i]>great) {
				great = a[i];
			}
		}
		System.out.println(great);
	}

}
