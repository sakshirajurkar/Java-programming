package package1;

public class VowelsByString {

	public static void main(String[] args) {
		String s = "AHSGEIOU";

		System.out.println("vowels");
		for (int i = 0; i < s.length(); i++) {
			if ((s.charAt(i) == 'A') || (s.charAt(i) == 'E') || (s.charAt(i) == 'I')
					|| (s.charAt(i) == 'O') || (s.charAt(i) == 'U'))	
			{
				System.out.print(s.charAt(i));
			}
		}
		System.out.println("\n");
		System.out.println("consonant");
		for (int i = 0; i < s.length(); i++) {
			if ((s.charAt(i) != 'A') && (s.charAt(i) != 'E') && (s.charAt(i) != 'I') && (s.charAt(i) != 'O')
					&& (s.charAt(i) != 'U'))
			{
				System.out.print(s.charAt(i));
			}
		}

	}

}
