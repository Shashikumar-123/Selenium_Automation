package Practice1;

public class Fabanocci {
/*
	public static void main(String[] args) {
int fab1=0;
int fab2=1;
for(int i=0;i<5;i++)
{
	int fab3=fab1+fab2;
System.out.println(fab3);
fab1=fab2;
fab2=fab3;
	}

}}
*/
	static void abc(int a,int b)
	{
		int fab1=0;
		int fab2=1;
		for(int i=a;i<=b;i++)
		{
			int fab3=fab1+fab2;
			System.out.println(fab3);
			fab1=fab2;
			fab2=fab3;
					}
	}
	public static void main(String[]args)
	{
		abc(1,10);}
	}