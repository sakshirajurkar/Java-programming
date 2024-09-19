package package1;
import java.util.Scanner;
public class AverageSumByArray {
	
	void createArray()
	{
		int a[] = new int[5];
		
		Scanner sc = new Scanner (System.in);
		System.out.println("enter the element");
	    for(int i=0; i<a.length; i++)
	    a[i] = sc.nextInt();
	     
	    int x = sum(a);
	    
	    for(int i=0; i<a.length; i++)
	    {
	    	System.out.println();
	    }
	}  
	
	
		
	     int sum (int [] a)
	    {
		int sum = 0;
		for (int i=0; i<a.length; i++)
		sum = sum+a[i];
		int average =0;
	    average = a.length/sum;
		return sum;
	}
	

	public static void main(String[] args) {
		AverageSumByArray ob = new AverageSumByArray();
		ob.createArray();
		
		
	}

}
