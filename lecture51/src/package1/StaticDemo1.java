package package1;

public class StaticDemo1 {
     static int num;
	public static void main(String[] args) {
		StaticDemo ob = new StaticDemo();
		ob.num = 67;
		
		StaticDemo ob1 = new StaticDemo();
		ob1.num = 73;
		
		System.out.println(ob1.num);
		System.out.println(ob.num);
		
	}
	}

