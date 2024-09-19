package package1;

public class Print5SubMarks {
   public static void main(String[] args) {
	int phy = 65;
	int chem = 87;
	int math = 45;
	int eng = 77;
	int bio = 87;
	
	float sum = phy + chem + math + eng + bio;
	System.out.println(sum);
	
	float percentage = (sum*100)/500;
	System.out.println(percentage);
	
	float average = sum/5;
	System.out.println(average);
}
}
