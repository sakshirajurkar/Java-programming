package package1;

public class CharacterPrintByArrays {

	public static void main(String[] args) {
		char ch[] = new char [5];
		
		ch[0] = 'a';
		ch[1] = 'b';
		ch[2] = 'c';
		ch[3] = '*';
		ch[4] = '%';
		
		for(int i = 0; i<=ch.length; i++)
		{
			System.out.println(ch[i]);
		}
		
		
	}
}
