package package1;

public class PercentageAverage {

	public static void main(String[] args) {
		int phy = 56;
		int chem = 98;
		int math = 76;
		int eng = 54;
		int bio = 87;
		int hindi = 88;
		float result = phy+chem+math+eng+bio+hindi;
		float percantage = (result/600)*100;
		
		{
			System.out.println("percent if marks: "+percantage);
		}
		float average = result/6;
		{
			System.out.println("average of marks: "+average);
		}
	}
}
