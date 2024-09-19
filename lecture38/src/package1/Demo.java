package package1;

public class Demo {

	public static void main(String[] args) {
		String name = "Hello";
		char ch1 = name.charAt(0);
		System.out.println(ch1);
		char ch2 = name.charAt(1);
		System.out.println(ch2);
		
		//length
		String s1 = "Anjali";
		System.out.println(s1.length());
		
		//lowercase
		String s2 = "WELCOME";
		System.out.println(s2.toLowerCase());
		
		//uppercase
		String s3 = "welcome";
		System.out.println(s3.toUpperCase());
		
		//concate
		String s4 = "Hello";
		String s5 = "World";
		System.out.println(s4.concat(s5));
		
		//index
		String s6 = "Java";
		System.out.println(s6.indexOf('v'));
	\}
	
}
