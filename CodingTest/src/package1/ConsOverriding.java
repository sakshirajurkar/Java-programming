package package1;
class vacume
{
	vacume()
	{
		System.out.println("calling constructor vacume");
	}
}
class heat  extends vacume
{
	heat()
	{
		System.out.println("calling constructor heat");
	}
}
public class ConsOverriding {

	public static void main(String[] args) {
		heat ob = new heat();
	}

}
