package Package1;

public class Reverse_String {

	public static void main(String[] args) {
		String name = "sakshi";
		String rev = "";
		
		for(int i=0; i<name.length(); i++) {
			rev = name.charAt(i)+rev;
		}
		System.out.println(rev);
	}
}
