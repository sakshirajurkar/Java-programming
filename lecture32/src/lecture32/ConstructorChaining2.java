package lecture32;

public class ConstructorChaining2 {
	
	void method()
	{
		this.method(6);
       System.out.println("0- args method");
	}
	void method(int i)
	{
		this.method(4,7);
		System.out.println("1- args method");
	}
	  void method(int i, int y)
	  {
		  this.method(7,7,33);
		  System.out.println("2- args method");
	  }
	  void method (int i, int y, int z)
	  {
		  System.out.println("3- args method");
	  }
	
  public static void main(String[] args) {
	  ConstructorChaining2 ob = new ConstructorChaining2();
	  ob.method();
}

}
