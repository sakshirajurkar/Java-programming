package package1;
//prime num by collection ArrayList
import java.util.ArrayList;

public class PrimeNumByCollection {

	public static void main(String[] args) {
		ArrayList <Integer> list = new ArrayList<>();
		ArrayList <Integer> list1 = new ArrayList<>();
		for(int i=1; i<=10; i++)
		{
			int count=0;
			for (int j=2; j<i; j++)
			{
				if(i%j==0)
				{
					count++;
				}
			}
			if (count>0)
			{
				list.add(i);
			}
			else
			{
				list1.add(i);
			}
		}
		System.out.println(list);
		System.out.println(list1);
	}

}
