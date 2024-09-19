package package1;

public class CopyArrays {

	//Copy this array into new array
	
	public static void main(String[] args) {
		char ch1[] = new char[4];
		
		ch1[0] = 'j';
		ch1[1] = 'a';
		ch1[2] = 'v';
		ch1[3] = 'a';
		
		char ch2[] = new char[4];
		ch2 = ch1;
		
		for(int i =0; i<ch2.length; i++)
		{
			System.out.println(ch2[i]);
		}
	}

}
