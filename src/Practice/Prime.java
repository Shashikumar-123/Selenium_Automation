package Practice;

public class Prime {

	static String fe(int a)
	{
		int count =0;
		for(int i=1;i<=a;i++)
			if (a%i==0)
			{
				count++;
			}
		if(count==2)
		{
			return("prime");
		}
		else
		{
			return("not a prime");
		}
		
	}
	public static void main(String[] args)
	{
	String s = fe(100);
	System.out.println(s);

	}
	}