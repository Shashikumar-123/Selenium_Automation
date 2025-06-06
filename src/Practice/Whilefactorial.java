package Practice;

public class Whilefactorial {
static void fac(int a)
{
int fact=1;
for(int i=a;i>=1;i--)
{
	fact =fact*i;
}
	System.out.println(fact);
}
public static void main(String[]args)
{
	int no=123;
	while (no!=0)
	{
		int rem = no%10;
	fac(rem);
	{
no=no/10;
}
}}}