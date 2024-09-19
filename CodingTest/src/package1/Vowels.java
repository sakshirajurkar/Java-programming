package package1;

public class Vowels {

	public static void main(String[] args) {
		String object = "akekipohu";
		
		System.out.println("vowels");
		for (int i=0; i<object.length(); i++) {
			if(object.charAt(i)=='a'|| object.charAt(i)=='e'|| object.charAt(i)=='i'||
			   object.charAt(i)=='o'||object.charAt(i)=='u') {
				System.out.println(object.charAt(i));
			}
		}
		System.out.println("\n");
		System.out.println("consonant");
		for(int i=0; i<object.length(); i++) {
			if(object.charAt(i)!='a'&&object.charAt(i)!='e'&&object.charAt(i)!='i'&&
				object.charAt(i)!='o'&& object.charAt(i)!='u') {
				System.out.println(object.charAt(i));
			}
		}
	}
}
