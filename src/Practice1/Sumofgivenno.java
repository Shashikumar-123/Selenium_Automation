package Practice1;

public class Sumofgivenno {

	/*
	  public static void main(String[] args) {
	
int no=5;
int sum=0;
for(int i=1;i<=no;i++)
{
	sum=sum+i;
}
System.out.println(sum);
	}

}
parameter
	static void abc(int a)
	{
		int sum=0;
		for(int i=a;i>=1;i--)
		{
			sum=sum+i;
		}
		System.out.println(sum);
	}
	
public static void main(String[]args)
{
	abc(10);}
}

*/
	static int abc(int a)
	{
		int sum=0;
		for(int i=1;i<=a;i++)
		{
			sum=sum+i;
		}
		return sum;
	}
public static void main(String[]args)
{
	int c = abc(12);
	System.out.println(c);
}}
