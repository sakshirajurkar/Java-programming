package package1;

public class SumofMarks {
	public static void main(String[] args) {
		int eng = 77;
		int phy =65;
		int chem = 88;
		int marks= eng+phy+chem;
		System.out.println("Sum of all Subject:"+marks);
		int average= marks/6;
		System.out.println("Average of all subject:" +average);
		int percent= marks*100/300;
		System.out.println("Percent of all subj:"+percent);
	}
}
