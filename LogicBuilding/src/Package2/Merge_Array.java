package Package2;

import java.util.ArrayList;

public class Merge_Array {

	public static void main(String[] args) {
		ArrayList ob = new ArrayList();
		ob.add(66);
		ob.add(65);
		ob.add(78);
		ob.add(87);
		
		ArrayList ob1 = new ArrayList();
		ob1.add(45);
		ob1.add(43);
		ob1.add(34);
		ob1.add(87);
		ob.addAll(ob1);
		System.out.println(ob);
	}
}
