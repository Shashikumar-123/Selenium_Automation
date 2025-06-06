package Practice1;

public class Primeno {

	//public static void main(String[] args) {
	static String abc(int no)
	{
int count=0;
for(int i=1;i<=no;i++)
{
	if(no%i==0)
	{
		count++;
	}}
	if(count==2)
	{
	return "prime";
	}
	else
	{
		return "notprime";
	}
}

public static void main(String[]args)
{
String c=	abc(5);
System.out.println(c);
}
}