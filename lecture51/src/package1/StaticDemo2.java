package package1;

public class StaticDemo2 {
     static int num;
     
     static void show ()
     {
    	 System.out.println("Hello");
     }
	public static void main(String[] args) {
		show();
		num= 56;
		System.out.println(num);
	}

}
