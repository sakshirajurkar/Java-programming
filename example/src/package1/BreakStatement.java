package package1;

public class BreakStatement {

	public static void main(String[] args) {
		for (int i=5; i<10; i++) {
			if (i==8)
				break;
			System.out.println(i);
		}
	}

}