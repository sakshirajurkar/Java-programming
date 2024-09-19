package package1;

public class PrintVowelsString {

	public static void main(String[] args) {
		String s = "gdhfhaeiou";
		System.out.println("vowels");
		for (int i=0; i<s.length(); i++)
		{
			if ((s.charAt(i)=='a')||(s.charAt(i)=='e')||(s.charAt(i)=='i')||(s.charAt(i)=='o')
					||(s.charAt(i)=='u'))
			{
				System.out.print(s.charAt(i));
			}
		}
		System.out.println("\n");
		System.out.println("consonant");
		for (int i=0; i<s.length(); i++)
		{
			if((s.charAt(i)!='a')&&(s.charAt(i)!='e')&&(s.charAt(i)!='i')&&(s.charAt(i)!='o')
					 &&(s.charAt(i)!='u'))
			{
				System.out.print(s.charAt(i));
			}
		}
		
		
	}
}
