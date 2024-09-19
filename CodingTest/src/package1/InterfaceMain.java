package package1;
interface myInterface{
	 void m1();
}
public class InterfaceMain implements myInterface {
       public void m1 () {
    	  System.out.println("interface");
      }
	public static void main(String[] args) {
		InterfaceMain ob = new InterfaceMain();
		ob.m1();
	}

}
