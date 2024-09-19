package Package3;

public class Pallindrom_String {

	public static void main(String[] args) {
		String name= "nayan";
		String temp =name;
		String dup = "";
		for(int i=0; i<name.length(); i++) {
			dup = name.charAt(i) + dup;
		}
		System.out.println(dup);
		if(dup.equals(temp)) {
			System.out.println("pallindrom string");
		}
		else {
			System.out.println("not pallindrom string");
		}
	}

}
