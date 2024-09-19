package Package1;

public class IndexArray {

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5, 5 };
		int num = 5;
		for(int i=0; i<arr.length; i++) {
			if(arr[i]==num) {
				System.out.println(++i);
			}
		}
	}
}
