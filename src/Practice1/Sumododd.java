package Practice1;

public class Sumododd {
/*
	public static void main(String[] args) {
		int no=10;
int sum=0;
for(int i=0;i<=no;i++)
{
	if(i%2==1)
	{
		sum=sum+i;
		System.out.println(sum);
	}}}}
parameter

	static void abc(int v)
	{
		int sum=0;
		for(int i=1;i<=v;i++)
		{
		if(i%2==1)
		{
			sum=sum+i;
		}}
		System.out.println(sum);
	}
	public static void main(String[]args)
	{
		abc(5);
	}}
*/
	static int abc(int c)
	{
		int sum=0;
		for(int i=1;i<=c;i++)
		{
			if(i%2==1)
			{
			sum=sum+i;
		}}
		return sum;
	}
	public static void main(String[]args)
	{
	int d=	abc(5);
	System.out.println(d);
	}}
	