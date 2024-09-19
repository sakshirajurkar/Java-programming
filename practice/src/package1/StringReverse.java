package package1;

public class StringReverse {

	public static void main(String[] args) {
		String name = "Raghav";
		String n = "";
		for(int i=0; i<name.length(); i++)
		{
			n=name.charAt(i)+n;
		}
		System.out.println(n);
	}

}
