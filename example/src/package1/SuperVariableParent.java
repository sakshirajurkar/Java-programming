package package1;

public class SuperVariableParent {
      int num = 100;
}
 class SuperVariableChild extends SuperVariableParent {
	int num = 110;

	void printNumber() {
		System.out.println(super.num);
	}
	public static void main(String[] args) {
		SuperVariableChild ob = new SuperVariableChild();
		ob.printNumber();
	}

}
