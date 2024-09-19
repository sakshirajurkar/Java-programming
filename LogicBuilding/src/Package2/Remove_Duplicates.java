package Package2;

import java.util.LinkedHashSet;

public class Remove_Duplicates {

	public static void main(String[] args) {
		int a[] = {2,3,4,2,6,7,9};
		
		LinkedHashSet <Integer> hs = new LinkedHashSet<Integer>();
		
		for(int i=0; i<a.length; i++) {
			hs.add(a[i]);
		}
		System.out.println(hs);
	}

}
