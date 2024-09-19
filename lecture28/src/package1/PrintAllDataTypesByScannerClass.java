package package1;
import java.util.Scanner;
public class PrintAllDataTypesByScannerClass {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter int value:");
	    int a = sc.nextInt();
	    
	    System.out.println("Enter float value:");
	    float b = sc.nextFloat();
	    
	    System.out.println("Enter String value:");
	    String c = sc.next();
	    
	    
	    System.out.println("Enter double value:");
	    double e = sc.nextDouble();
	    
	    
	    System.out.println("Print the value of int:"+a);
	    System.out.println("Print the value of float:"+b);
	    System.out.println("Print the value of String:"+c);
	    System.out.println("Print the value of doublr:"+e);
	   
	    
	    
	    
	    
	    
	}

}
