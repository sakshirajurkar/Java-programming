package package1;

public class MethodType3 {
  int addOperation()
  {
	  int a = 4;
	  int b = 5;
	  int result = a+b;
	  return result;
  }
  void displayResult()
  {
	  int r = addOperation();
	  System.out.println(r);
  }
  public static void main(String[] args) {
	  
	  MethodType3 object = new MethodType3 ();
	  object.displayResult();
	
}
	
}
