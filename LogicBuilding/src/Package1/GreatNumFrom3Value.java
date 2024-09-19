package Package1;

public class GreatNumFrom3Value {

	public static void main(String[] args) {
		int a =10, b= 15, c= 20;
		
		if(a>b && a>c) {
			System.out.println("maximum num is:"+ a);
		}
		else if(b>a && b>c) {
			System.out.println("maximum num is:"+b);
		}
		else {
			System.out.println("maximum num is:"+c);
		}
	}
}
