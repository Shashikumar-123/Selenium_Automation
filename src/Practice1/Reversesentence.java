package Practice1;

public class Reversesentence {
static String total(String s)
{
String rev="";
for(int i=s.length()-1;i>=0;i--)
{
	rev=rev+s.charAt(i);
}
return rev;
}
static void onlyone(String s)
{
String[] a=	s.split(" ");

	for(int j=a.length-1;j>=0;j--)
	{
		if (j==2)
		{
			System.out.print(total(a[j]+" "));
		}
		else
		{
			System.out.print(a[j]+" ");
		}
	}}
public static void main(String[]args)
	{
		String d="Shashi as automation tester with  10 lpa";
		onlyone(d);
	}
}
