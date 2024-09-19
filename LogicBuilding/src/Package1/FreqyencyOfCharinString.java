package Package1;

public class FreqyencyOfCharinString {

	public static void main(String[] args) {
		String name = "sakshi rajurkar";
		int count = 0;
		for (int i = 0; i < name.length(); i++) {
			for (int j = 0; j < i; j++) {
				if (name.charAt(i) == 's' || name.charAt(i) == 'a' || name.charAt(i) == 'k' || name.charAt(i) == 'h'
						|| name.charAt(i) == 'i' || name.charAt(i) == 'r' || name.charAt(i) == 'j'
						|| name.charAt(i) == 'u')
				{
					System.out.println(name.charAt(i));
				}
			}

		}

	}

}
