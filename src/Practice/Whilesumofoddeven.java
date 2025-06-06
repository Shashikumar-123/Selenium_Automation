package Practice;

public class Whilesumofoddeven {
	/*
	static void abc(int a)
	{
		int oddsum=0;
		int evensum=0;
		while(a!=0)
		{
			int rem = a%100;
		if	(rem%2==0)
		{
			
			oddsum = oddsum+rem;
					}
		else
		{
			evensum = evensum+rem;
		}
		a= a/100;
		System.out.println(oddsum);
		System.out.println(evensum);
	}
	}
	public static void main(String[] args) {
abc(1456);
	}

}
*/	
	public static void main(String[] args) {
		int a=1456;
	
	int oddsum=0;
	int evensum=0;
	while(a!=0)
	{
		int rem = a%100;
	if	(rem%2==0)
	{
		
		oddsum = oddsum+rem;
				}
	else
	{
		evensum = evensum+rem;
	}
	a= a/100;
	System.out.println(oddsum);
	System.out.println(evensum);
}}
}