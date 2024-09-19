package OOPS;
class A4 {
	float fees;
	int id;
	String name;
	A4 (float f){
		fees = f;
		System.out.println("one");
	}
	A4(float f, int i){
		id = i;
		fees = f;
		System.out.println("two");

	}
	A4 (float f, int i,String s){
		id = i;
		fees = f;
		name = s;
		System.out.println("three");
	}
}
public class ConstructorOverloading2 {

	public static void main(String[] args) {
		A4 ob1 = new A4(654.7565f);
		A4 ob2 = new A4(654.7565f, 76);
		A4 ob3 = new A4(654.7565f, 76,"radha");
	}
}
