package package1;
import java.util.Scanner;
public class SmallestNumByScannerClass {

	public static void main(String[] args) {
		Scanner ss = new Scanner(System.in);
		
		System.out.println("enter the number");
		int a = ss.nextInt();
		
		System.out.println("enter the number");
        int b = ss.nextInt();
        
        System.out.println("enter the number");
        int c = ss.nextInt();
        
       if(a<b&a<c)
       {
    	   System.out.println(a+" is smallest value: ");

       }
       else if(b<a&b<c)
       {
    	   System.out.println(b+" is smallest value: ");
    	   
       }
       else
       {
    	   System.out.println(c+" is smallest value: ");

       }
       
        
		
		
	}

}
