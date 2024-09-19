package package1;
import java.util.ArrayList;
import java.util.Iterator;
public class IndexProvidingElementDisplay {
//dislpay the element by providing the index
	public static void main(String[] args) {
		ArrayList ob = new ArrayList ();
		ob.add("Rasha");
		ob.add("Amayra");
		ob.add("ariv");
		ob.add("Ishvari");
		
		
		
		for (int i=0; i<ob.size(); i++)
		{
			System.out.println(ob.get(i));
		}
		
		
		
	}

}
