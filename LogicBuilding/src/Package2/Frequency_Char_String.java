package Package2;

public class Frequency_Char_String {

	public static void main(String[] args) {
		String name = "sakshi rajurkar";
		char chr= 's';
		int count =0;
		for(int i=0; i<name.length(); i++) {
			if(name.charAt(i)==chr) {
				count++;
			}
		}
		System.out.println(count);
	}

}
