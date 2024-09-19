package package1;

public class LogicalOperator {
   public static void main(String[] args) {
	int a = 2;
	int b = 4;
	
	System.out.println((a<b)&&(b>a));//first condition true + second condtion true = true
	System.out.println((a<b)&&(b<a));//first condition true + second condtion false = false
	System.out.println (a==b); //false
}
}
