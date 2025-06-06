package Practice;

public class Recursion1 {

	static void abc(int a)
	{
		if (a<=10)
		{
			System.out.println(a);
			a++;
			abc(a);
		}
	}
	public static void main(String[] args) {
	abc(1);
	}
}
