package OOPS;
class overloading{
	int id;
	String name;
	float fees;
	void m1(int a) {
		id = a;
	}
	void m1(int a, String s) {
		id = a;
		name = s;
	}
	void m1(int a, String s, float f) {
		id =a;
		name = s;
		fees = f;
	}
}

public class MethodOverloading5 {

	public static void main(String[] args) {
		overloading ob = new overloading(); 
		ob.id = (65);
		ob.name = ("sharayu");
		ob.fees = (65.86f);
		System.out.println("id:"+ ob.id + " name: "+ob.name+ " fees: "+ob.fees);
	}
}
