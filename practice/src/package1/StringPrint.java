package package1;

public class StringPrint {

	public static void main(String[] args) {
		String S = "ABCDEIOUJ";
		System.out.println("vowels");
		for (int i = 0; i < S.length(); i++) {
			if ((S.charAt(i) == 'A') || (S.charAt(i) == 'E') || (S.charAt(i) == 'I') || (S.charAt(i) == 'O')
					|| (S.charAt(i) == 'U'))

			{
				System.out.print(S.charAt(i));
			}
		}
		System.out.println("\n");
		System.out.println("consonant");
		for (int i = 0; i < S.length(); i++) {
			if ((S.charAt(i) != 'A') && (S.charAt(i) != 'E') && (S.charAt(i) != 'I') && (S.charAt(i) != 'O'))

			{
				System.out.print(S.charAt(i));
			}
		}
	}
}
