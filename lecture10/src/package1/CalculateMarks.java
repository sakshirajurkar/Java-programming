package package1;

public class CalculateMarks {
	public static void main(String[] args) {
		
	
   int Physics = 66;
   int Chemistry = 78;
   int Math = 98;
   int Biology = 76;
   int English = 56;
   
   int Result = Physics+Chemistry+Math+Biology+English;
   System.out.println("Sum of all marks="+Result);
   
   int Percentage = (Result*100)/500;
   System.out.println("Percentage of all subject:"+Percentage);
   
   float PercentageF = (Result*100)/500;
   System.out.println("Percentage of Sub="+PercentageF);
	}
   
}
