package Practice1;

public class Factorialofgivenno {
/*
	public static void main(String[] args) {
int no=6;
int fact=1;
for(int i=no;i>=1;i--)
{
	fact=fact*i;
}
System.out.println(fact);
	}
	}

                                           parameter
	static void abc(int a,int b)
	{
		int fact=1;
		for(int i=b;i<=a;i++)
		{
			fact=fact*i;
		}
		System.out.println(fact);
	}
public static void main(String[] args) {

abc(10,1);
}}
	*/
	
	static int abc(int a,int b)
	{
		int fact=1;
		for(int i=a;i>=b;i--)
		{
			fact=fact*i;
		}
		return fact;
	}
		
	
public static void main(String[]args)
{
	int c =abc(19,1);
	System.out.println(c);
}
}
	
	