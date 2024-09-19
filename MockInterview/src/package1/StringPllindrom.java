package package1;

public class StringPllindrom {

	public static void main(String[] args) {
		String name = "nayan";
		String empty = "";
		for(int i=0; i<name.length(); i++)
		{
			empty = name.charAt(i)+empty;
		}
		System.out.println(empty);
		
		if(name.equals(empty))
			
		{
			System.out.println("pallindrom string");
		}
		else
		{
			System.out.println("not pallindrom");
		}
	}
}
//