package package1;

public class TypesOfMethod3 {
	int greaterNum() {
		int a = 6;
		int b = 8;

		if (a > b) {
			return a;
		} else {
			return b;

		}

	}

	void displayResult() {
		int x = greaterNum();
		System.out.println(x + " is greater num ");

	}

	public static void main(String[] args) {

		TypesOfMethod3 ob = new TypesOfMethod3();
		ob.displayResult();

	}

}
