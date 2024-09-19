package Package1;

public class FrequencyOfCharInString {

	public static void main(String[] args) {
		String name = "Sakshi Rajurkar";
		char chr = 'a';
		int count = 0;
		for(int i=0; i<name.length(); i++) {
			if (chr == name.charAt(i)) {
				count++;
			}
		}
		System.out.println(count);
	}
}
