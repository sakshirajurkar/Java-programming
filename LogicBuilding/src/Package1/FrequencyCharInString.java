package Package1;

public class FrequencyCharInString {

	public static void main(String[] args) {
		String name = "sakshi rajurkar";
		char ch = 's';
		int count = 0;
		
		for(int i=0; i<name.length(); i++) {
			if(name.charAt(i) == ch) {
				count++;
			}
		}
		System.out.println(count);
	}
}
