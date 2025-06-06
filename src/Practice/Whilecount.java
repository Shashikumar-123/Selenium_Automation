package Practice;

public class Whilecount {
	static void ss(int a)
	{
		int fact =1;
		for(int i=a;i>=1;i--)
		{
			fact=fact*i;
		}
		System.out.println(fact);
	}

	public static void main(String[] args) {
int no=1234;
int count=0;
while(no!=0)
{
	int rem = no%10;
	count ++;
	no=no/10;
	System.out.println(count);
}
	}

}
