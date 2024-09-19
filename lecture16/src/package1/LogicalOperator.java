package package1;

public class LogicalOperator {
   public static void main(String[] args) {
	 int a = 2;
	 int b = 4;
	 int c = 6; 
	 //AND operator
	 System.out.println((a>b)&&(a>c));
	 System.out.println((b>a)&&(b>c));
	 System.out.println((c>a)&&(c>b));
	 
	
	 //Or operator 
	 char ch = 's';
	 System.out.println((ch=='s')||(ch=='a')||(ch=='k')||(ch=='h')||(ch=='i'));
	 
}
}
