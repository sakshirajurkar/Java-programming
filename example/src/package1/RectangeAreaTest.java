package package1;

class RectangleArea {
	int length;
	int breadth;

	void Rectangle(int l, int b) {
		length = l;
		breadth = b;
	}
	int getArea () {
		return length * breadth;
	}
}

public class RectangeAreaTest {

	public static void main(String[] args) {
		RectangleArea r = new RectangleArea();
		r.Rectangle(6, 7);
		System.out.println(r.getArea());
	}
}
