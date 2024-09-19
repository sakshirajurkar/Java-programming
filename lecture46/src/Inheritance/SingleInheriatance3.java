package Inheritance;
class vehical {
	String vehicalType;
}

class car extends vehical {
	String modelType;
	
	void showDetails () {
		System.out.println(vehicalType + "  "+modelType);
	}
}
public class SingleInheriatance3 {

	public static void main(String[] args) {
		car car1 = new car();
		car1.vehicalType = "car";
		car1.modelType = "Sports Car";
		car1.showDetails ();

	}
}
