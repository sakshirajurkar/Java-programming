package lecture32;
public class ConstructorChaining3 {

	String name;
    int id ;
    float marks;
    boolean result;
    
    ConstructorChaining3()
    {
    	this("Arti");
    	name = null;
    	id = 0;
    	marks = 00.0f;
    	System.out.println("0-arga parameter");
    }
    ConstructorChaining3(String s)
    {
    	this("Raha",101);
    	System.out.println("1-arga parameter");
    }
    ConstructorChaining3(String s,int i)
    {
    	this("reena",102,60.65f);
    	System.out.println("2-arga parameter");
    }
    ConstructorChaining3(String s,int i,float f)
    {
    	this("akansha",103,99.09f,true);
    	System.out.println("3-arga parameter");
    	
    }
    ConstructorChaining3(String s,int i,float f,boolean b)
    {
    	System.out.println("4-arga parameter");
    	
    }
    
    public static void main(String[] args) {
		ConstructorChaining3 ob = new ConstructorChaining3();
	}
}
