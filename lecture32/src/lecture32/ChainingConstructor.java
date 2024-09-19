package lecture32;

public class ChainingConstructor {

	//instance variable
	int x;
	 
	ChainingConstructor()
	{
		this(3);
		x=1;
		System.out.println("0-paramiterized contrustor");
	}
	ChainingConstructor(int a)
	{	
		this(5,2);
		System.out.println("1-paramiterized contrustor");
	}
	ChainingConstructor(int a, int y)
	{
	  this(7,8,56);
	  System.out.println("2-paramiterized contrustor");
	}
	ChainingConstructor(int a, int y, int z)
	{
		System.out.println("3-paramiterized contrustor");
	}
	public static void main(String[] args) {
		new ChainingConstructor();
	}

}
