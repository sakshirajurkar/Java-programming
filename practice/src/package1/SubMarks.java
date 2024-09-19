package package1;

public class SubMarks {

	public static void main(String[] args) {
		int phy = 76;
		int chem = 87;
		int eng = 65;
		int bio = 76;
		
		int result = phy+chem+eng+bio;
		int percent = (result/400)*100;
		{
			System.out.println("percent of marks: "+percent);
		}
		int average = 4/result;
		{
			System.out.println("average of marks:"+average);
		}
	}

}
;