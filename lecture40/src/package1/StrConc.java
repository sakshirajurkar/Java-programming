package package1;

public class StrConc {

	public static void main(String[] args) {
		String s1 = "hello";
		String s2 = "JAVA";
		String s3 = "       programming      ";
		String s4 = "hello";
		//charAt
		char ch = s1.charAt(0);
		System.out.println(ch);
		//toLowercase
		System.out.println(s2.toLowerCase());
		//toUppercase
		System.out.println(s1.toUpperCase());
		//trim
		System.out.println(s3.trim());
		//contain
	    System.out.println(s1.contains(s4));
	    //valueOf
	    System.out.println(s1.valueOf(s4));
	    //substring
	    System.out.println(s2.substring(3));
	    //equals
	    System.out.println(s1.equals(s4));
	    //concat
	    System.out.println(s1.concat(s2));
	    //last of index
	    System.out.println(s1.lastIndexOf('l'));
	}

}
  