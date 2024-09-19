package Package1;

import java.util.Scanner;

public class MiddleArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("enter the array size");
		int num = sc.nextInt();
		System.out.println("enter array");
		int a[] = new int[num];
		
		for(int i=0; i<a.length; i++) {
			a[i] = sc.nextInt();
		}
		
		int mid =0;
		
		for(int i=0; i<a.length; i++) {
			mid = a[i] /2;
		}
		System.out.println(mid);
	}

}
