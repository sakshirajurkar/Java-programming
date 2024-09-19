package Package3;

public class Swap_Two_Num2 {

	public static void main(String[] args) {
		int num1 = 3;
		int num2 =5;
		
		System.out.println("num1: "+num1+" num2:"+num2);
		num2 = num1 + num2;//8
		num1 =num2-num1;//3
		num2 = num2-num1;
		System.out.println("After swap:-"+"num1: "+num1+"+ num2:"+num2);
		
	}

}
