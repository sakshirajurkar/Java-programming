package package1;

import java.util.ArrayList;

public class VowelsConsonantByCollection {

	public static void main(String[] args) {
		ArrayList <Character> vowels = new ArrayList <> ();
		ArrayList <Character> consonant = new ArrayList <> ();
		String str = "shreyas";
		for(int i=0; i<str.length(); i++)
		{
			if((str.charAt(i)=='a')||(str.charAt(i)=='e')||(str.charAt(i)=='i')||
					(str.charAt(i)=='o')||(str.charAt(i)=='u'))
			{
				System.out.println(vowels.charAt(i));
			
		    }
			else
			{
				System.out.println(str.charAt(i));
			}
			
		}
		
		
	}

}
