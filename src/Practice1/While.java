package Practice1;

public class While {
/*
	public static void main(String[] args) {
int no=143;
while(no!=0)
{
	int rem=no%10;
	System.out.println(rem);

no=no/10;
System.out.println(no);
	}}

}
*/
	static void abc(int a)
	{
		while(a!=0)
		{
			int rem=a%10;
			//System.out.println(rem);
			a=a/10;
			System.out.println(a);
		}
	}
	public static void main(String[]args)
	{
		abc(1432);
	}	}