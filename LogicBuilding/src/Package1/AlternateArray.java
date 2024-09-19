package Package1;
//You are given an array arr. You need to print elements of arr in alternate order(starting from index 0).
public class AlternateArray {

	public static void main(String[] args) {
		int arr[] = {1, 2, 3, 4};
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
			i++;
		}
	}

}
