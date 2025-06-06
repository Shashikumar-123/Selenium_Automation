package Practice;

public class revss {

static String reverse(String s)

{
	String rev ="";
	for(int i=s.length()-1;i>=0;i--)
	{
		rev=rev+s.charAt(i);
	}
	return rev;
}
static void reversesent(String s) 
{
	String[] st = s.split(" ");	
	int b=st.length-1;
	for(int j=b;j>=0;j--)
	{
		if(j==1)
		{
		System.out.print(reverse(st[j]+" "));
	}
	else
	{
		System.out.print((st[j]+" "));
	}
	}}
public static void main (String[]args)
{
	String r ="Got Automation Job with 10 lpa";
	reversesent(r);
}
	
}


