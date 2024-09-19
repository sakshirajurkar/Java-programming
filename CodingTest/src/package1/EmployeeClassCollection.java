package package1;
import java.util.LinkedList;
import java.util.Iterator;
public class EmployeeClassCollection {

	public static void main(String[] args) {
		LinkedList ob = new LinkedList();
		EmployeeClassCollectionMain em1 = new EmployeeClassCollectionMain("Aneesh", 102);
		EmployeeClassCollectionMain em2 = new EmployeeClassCollectionMain ("Kriti", 104);
		EmployeeClassCollectionMain em3 = new EmployeeClassCollectionMain ("Kranti", 105);
		EmployeeClassCollectionMain em4 = new EmployeeClassCollectionMain ("Kavya", 106);
		EmployeeClassCollectionMain em5 = new EmployeeClassCollectionMain ("Ritika", 107);
		
		ob.add(em5);
		ob.add(em4);
		ob.add(em3);
		ob.add(em2);
		ob.add(em1);
		
		Iterator itr = ob.iterator();
		while (itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}

}
