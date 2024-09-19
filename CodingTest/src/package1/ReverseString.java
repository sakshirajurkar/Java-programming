package package1;

public class ReverseString {

	public static void main(String[] args) {
		String name = "Sakshi";
		String rev = "";
		 for (int i=0; i<name.length(); i++) {
			 rev = name.charAt(i)+rev;
		 }
		 System.out.println("Reverse string:"+rev);
				
	}

}
