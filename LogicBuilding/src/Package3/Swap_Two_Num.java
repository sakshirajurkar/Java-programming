package Package3;

public class Swap_Two_Num {

	public static void main(String[] args) {
		int num1 = 5;
		int num2 = 7;
		System.out.println("num1: "+ num1 + " num2: "+ num2);
		num1 = num1 + num2; //5+7=12
		num2 = num1 - num2;//12-7=5
		num1 = num1 - num2;//12-5=7
		System.out.println("num1: "+ num1 + " num2: "+ num2);
		
	}
}
