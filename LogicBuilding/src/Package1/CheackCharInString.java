package Package1;

public class CheackCharInString {

	public static void main(String[] args) {
		String name = "anshula sharma";
		char chr = 'a';
		int count =0;
		for(int i=0; i<name.length(); i++) {
			if(name.charAt(i) == chr) {
				count++;
			}
		}
		System.out.println(count);
	}

}
