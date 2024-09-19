package Package2;

public class Vowels_From_String {

	public static void main(String[] args) {
		String name = "sakshi rajurkar";
		String s = "";

		for (int i = 0; i < name.length(); i++) {
			if (name.charAt(i) == 'a' || name.charAt(i) == 'e' || name.charAt(i) == 'i' || name.charAt(i) == 'o'
					|| name.charAt(i) == 'u') {
				System.out.println(name.charAt(i));
			}
		}
		for (int j = 0; j < name.length(); j++) {
			if (name.charAt(j) != 'a' && name.charAt(j) != 'e'&& name.charAt(j) != 'i' && name.charAt(j) != 'o'
					&& name.charAt(j) != 'u') {
				s = s + name.charAt(name.charAt(j));
			}
		}

	}

}
