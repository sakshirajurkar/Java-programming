package package1;

public class Practice {
    
	int p = 6;
	int q = 4;
	
	
	int greaternum()
	{
		if (p<q)
		{
			return p;
		}
		else
		{
			return q;
		}
	}
	
	public static void main(String[] args) {
		Practice ob = new Practice();
		int x =  greaternum();
		System.out.println(x);                       			

}
}
