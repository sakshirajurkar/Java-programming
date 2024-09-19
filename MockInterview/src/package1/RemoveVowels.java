package package1;

public class RemoveVowels {

	public static void main(String[] args) {
		String name = "Sakshi Rajurkar";
		String s = "";

		for (int i = 0; i < name.length(); i++) {
			if (name.charAt(i) != 'a' && name.charAt(i) != 'e' && name.charAt(i) != 'i' && name.charAt(i) != 'o'
					&& name.charAt(i) != 'u') {
				s = s + name.charAt(i);
			}
		}
		System.out.println(s);
	}

}
