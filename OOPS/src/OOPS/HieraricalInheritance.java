package OOPS;
class car
{
	String carName;
	int carNum;
}
class bike extends car
{
	String bikeName;
	int bikeNum;
	void m1()
	{
		System.out.println("First class: ");
		System.out.println(carName + " " + carNum);
		System.out.println(bikeName + " " + bikeNum);
	}
}
class scooty extends car
{
	String scootyName;
	int scootyNum;
	void m2()
	{
		System.out.println("Second class : ");
		System.out.println(carName + " " + carNum);
		System.out.println(scootyName + " " + scootyNum);
		
	}
}

public class HieraricalInheritance {

	public static void main(String[] args) {
		bike ob = new bike();
		ob.carName = ("Scorpio");
		ob.carNum = (5457);
		ob.bikeName = ("Hero Honda");
		ob.bikeNum = (8666);
		ob.m1();
		
		scooty ob1 = new scooty();
		ob1.carName = ("Marcedese");
		ob1.carNum = (7557);
		ob1.scootyName = ("Activa i");
		ob1.scootyNum = (7754);
		ob1.m2();
		
	}

}
