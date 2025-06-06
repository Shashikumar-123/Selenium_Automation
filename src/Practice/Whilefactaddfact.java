package Practice;

public class Whilefactaddfact {

static int abc(int a)
{
	int fact=1;
	for(int i=a;i>=1;i--)
	{
		fact = fact*i;
	}
	return fact;
}
	
public static void main(String[] args) {
int no=123;
int sum=0;
while(no!=0)
{
int rem=no%10;
{
	sum=sum+abc(rem);
no = no/10;
System.out.println(sum);
}}
}}