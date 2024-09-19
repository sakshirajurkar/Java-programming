package Package1;

public class Char_in_String {

	public static void main(String[] args) {
		String name = "shruta rajput";
		char chr = 'a';
		int count =0;
		
		for(int i=0; i<name.length(); i++) {
			if(name.charAt(i)==chr) {
				count++;
			}
		}
		System.out.println(count);
	}
}
