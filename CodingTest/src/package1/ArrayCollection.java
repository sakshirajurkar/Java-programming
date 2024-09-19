package package1;

import java.util.ArrayList;

public class ArrayCollection {

	public static void main(String[] args) {
		ArrayList <String> ob =  new ArrayList <String> ();
		ob.add("tara");
		ob.add("sara");
		ob.add("kiara");
		ob.add("anayra");
		System.out.println(ob);
		ob.add("shivanya");
		System.out.println(ob);
		System.out.println(ob.get(0));
	}
}
