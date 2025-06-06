package Practice;

public class Recursion {
	static void rec(int a)
	{
		if(a>=1)
		{
			System.out.println(a);
			a--;
			rec(a);
		}
	}
	public static void main(String[]args)
	{
		rec(10);
	}
}
