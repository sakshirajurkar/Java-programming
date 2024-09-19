package Package1;

public class StringReverse {

	public static void main(String[] args) {
		String flower = "Tulip";
		String rev = "";

		for (int i = 0; i < flower.length(); i++) {
			{
				rev = flower.charAt(i) + rev;
			}
		}
		System.out.println(rev);
	}

}
/*
 * str= abcd rev="" rev=str.charAt(i)+rev rev=T uT lut ilut pilut
 * 
 * 
 
*/