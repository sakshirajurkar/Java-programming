package package1;

import java.util.Arrays;
    //check if two arrays are same or not
public class ComparisonArrays {

	public static void main(String[] args) {
		int a1[] = {1,2,3};
		int a2[] = {1,2,3};
		
		if(Arrays.equals(a1,a2))
		{
			System.out.println("Same");
		}
		else
		{
			System.out.println("Not Same");
		}
	}

}
