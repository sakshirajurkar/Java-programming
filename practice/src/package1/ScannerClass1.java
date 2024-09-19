package package1;
import java.util.Scanner;
public class ScannerClass1 {

	public static void main(String[] args) {
		 Scanner ob =new  Scanner(System.in);
		 
		 	System.out.println("Enter num");
		    int  a = ob.nextInt();
		    
		    if(a%2==0)
		    {
		    	System.out.println("This is a even num");
		    }
		    else
		    {
		    	System.out.println("This is a odd num");
		    }
	}
	

}
