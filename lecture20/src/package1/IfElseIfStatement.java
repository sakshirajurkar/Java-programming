package package1;

public class IfElseIfStatement {
      public static void main(String[] args) {
		int a = 7;
		int b = 8;
		int c = 5;
		
	    if ((a>b)&&(a>c))
	    {
	    	System.out.println(a + " is greatest number");
	    }
	    else if ((b>a)&&(b>c))
	    {
	    	System.out.println(b + " is greates number");
	    }
	   
	    if ((c>a)&&(c>b))
	    {
	    	System.out.println(c + "is greatest number");
	    }
	}
}
