package lecture31;

public class Constructor {
	String  name;
	
	Constructor()
	{
		name = null;
	}

	public static void main(String[] args) {
		Constructor sc = new Constructor();
		System.out.println(sc.name);
		
	}

}
