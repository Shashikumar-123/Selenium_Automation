package Practice1;

public class Anstromeno {

	public static void main(String[] args) {
int no=153;
int sum=0;//
int copy=no;
while(no!=0)
{
	int rem=no%10;
	sum=sum+(rem*rem*rem);
	no=no/10;
}
if(copy==sum)
{
	System.out.print("Anstrome");
}
else
{
	System.out.print("not");
}
	}}

