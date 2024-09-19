package package1;
import java.util.Scanner;
//write a java program calculate area of square by scanner  
public class Exercise15 {

	public static void main(String[] args) {
		Scanner sc =new Scanner (System.in);
		System.out.println("Enter side of square");
		double side = sc.nextDouble();
		double area = side * side;
		System.out.println("Area of Square is: "+area);
	}

}
