package package1;

public class CopyArray {

	//Copy this array into new array
	public static void main(String[] args) {
		char ch1[] = new char [5];
		
		ch1[0] = 'L';
		ch1[1] = 'O';
		ch1[2] = 'T';
		ch1[3] = 'U';
		ch1[4] = 'S';
		
		
		char ch2[] = new char [5];
		ch2=ch1;
		for (int i=0; i<ch2.length; i++)
		
		System.out.println("Array of ch2: "+ch2[i]);
		
	}

}
