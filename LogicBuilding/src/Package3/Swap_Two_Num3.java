package Package3;

public class Swap_Two_Num3 {

	public static void main(String[] args) {
		int num1 = 4;
		int num2 = 8;
		
		System.out.println("num1:- "+num1 + " num2:- " + num2);
		num1 = num1 + num2;//12
		num2 = num1 - num2;//4
		num1 = num1 - num2;
		System.out.println("num1:- "+num1 + " num2:- "+num2);
	}

}
