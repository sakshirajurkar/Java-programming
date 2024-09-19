package lecture31;

public class ConstructorOverloading {
	
	//instance variable 
	String name;
	int id;
	double salary;
	char section;
	boolean attendence;
	
	
	
	
	ConstructorOverloading(String s)//one paramiterized
	{
		name = s;
	}
	ConstructorOverloading(String s, int i)// two paramiterized
	{
		name = s;
		id = i;
	}
	ConstructorOverloading(String s, int i, float f) //three paramiterized
	{
		name =s;
		id = i;
		salary = f;
		
	}
	ConstructorOverloading (String s, int i, float f, char c)//four paramiterized
	{
		name = s;
		id = i;
		salary = f;
		section = c;
	}
	ConstructorOverloading(String s, int i, float f, char c, boolean b)//five paramiterized
	{
		name = s;
        id = i;
        salary = f;
        section = c;
        attendence = b;
        
	}
	{
		
	}
	void employee()
	{
		System.out.println(name+"  "+id+"  "+salary+"  "+section+"  "+attendence);
	}
	
	
	
			

	public static void main(String[] args) {
		ConstructorOverloading sc = new ConstructorOverloading("Ankita");
		sc.employee();
		
		ConstructorOverloading sc1 = new ConstructorOverloading("Neha",102);
		sc1.employee();
		
		ConstructorOverloading sc2 = new ConstructorOverloading("Anjali",103,41000);
		sc2.employee();
		
		ConstructorOverloading sc3 = new ConstructorOverloading("Kriti",103,32000,'A');
		sc3.employee();
		
		ConstructorOverloading sc4 = new ConstructorOverloading("Radha",104,76000,'B',true);
		sc4.employee();
		
	}

}
