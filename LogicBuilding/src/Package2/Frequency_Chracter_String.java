package Package2;

public class Frequency_Chracter_String {

	public static void main(String[] args) {
		String s = "sakshi";
		char chr = 's';
		int count =0;
		for(int i=0; i<s.length(); i++) {
			if(s.charAt(i)==chr) {
				count++;
			}
		}
		System.out.println(count);
	}

}
