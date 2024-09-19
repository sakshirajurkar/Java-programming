package package1;

public class Methods {
	void sum(int a, int b)
	{
		int res = a+b;
		System.out.println("sum of num: "+res);
	}
	int mul(int num1, int num2)
	{
		int res = num1*num2;
		return res;
	}
	void div(int p, int q)
	{
	
		int res = p/q;
		System.out.println("divsion of num: "+res);
	}
	void sub (int a, int b)
	{
		int res = a-b;
        System.out.println("substraction of num: "+res);
	}
	
	
	

	public static void main(String[] args) {
		
		Methods ob = new Methods();
		ob.sum(5,7);
		int a = ob.mul(9,2);
		System.out.println("multiplication of num:"+a);
		ob.div(7,9);
		ob.sub(7, 4);
				
		
		
		
	}

}
