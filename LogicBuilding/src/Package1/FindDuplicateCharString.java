package Package1;

public class FindDuplicateCharString {

	public static void main(String[] args) {
		String str = "apple";
		String chr = str;

		for (int i = 0; i < str.length(); i++) {
			if(str == chr) {
				System.out.println(str);
			}
		}
	}

}
