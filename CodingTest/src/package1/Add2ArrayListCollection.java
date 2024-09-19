package package1;
import java.util.ArrayList;
public class Add2ArrayListCollection {
 //Add 2 array list and form 1 array list
	public static void main(String[] args) {
		ArrayList ob = new ArrayList();
		ob.add("Aviraj");
		ob.add("Siraj");
		ob.add("Prithviraj");
		ob.add("Kaviraj");
		ob.add("Vanraj");
	
        ArrayList  ob1 = new ArrayList ();
        ob1.add("Mumbai");
        ob1.add("nagpur");
        ob1.add("Akola");
        ob1.add("kolkata");  
        
        ob.addAll(ob1);
        System.out.println(ob);
        
	}

}
