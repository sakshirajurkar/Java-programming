package collection_day3;
import java.util.ArrayList;
import java.util.Iterator;
public class EmployeMain {

   public static void main(String[] args) {
	   ArrayList <Employe> ob = new ArrayList <Employe> ();
	   Employe em = new Employe ("Aradhya", 45000.80f);
	   Employe em1 = new Employe ("Anshul", 76000.76f);
	   Employe em2 = new Employe ("Ravi", 65000.76f);
	   Employe em3 = new Employe ("Kalyani", 87000.77f);
	   Employe em4 = new Employe ("Raha", 85000.76f);
	   
	   ob.add(em);
	   ob.add(em1);
	   ob.add(em2);
	   ob.add(em3);
	   ob.add(em4);
	   
	   for(int i=0; i<ob.size(); i++)
	   {
		   System.out.println(ob.get(i).getName() + " " +ob.get(i).getSalary());
	   }
}
   
   

}
