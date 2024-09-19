package package1;
import java.util.Scanner;
public class SumOfArray {

	void createArray()
	{
		int a[] = new int[5];
		
		Scanner sc = new Scanner(System.in);
		
		
		for (int i=0; i<a.length; i++)
		a[i] = sc.nextInt();
		
		int x = sum(a);
		display (x,a);
	}
   void	display(int sum, int a[])
   {
	   for (int i=0; i<a.length; i++)
		   System.out.println(a[i]);
	   {
		   System.out.println("Sum of array"+sum);
	   }
   }
   
   
	  int sum (int [] a)
	{
		  System.out.println("Sum of array");
		int sum =0;
		for(int i=0; i<a.length; i++)
			sum = sum+a[i];
		    return sum;
		
	}
	  
	
	
    public static void main(String[] args) {
    	SumOfArray ob = new SumOfArray();
    	ob.createArray();
    	
    }
}
