package Practice;

public class Demoss {
	
static String ispalendrome(String s)
{
	String rev="";
for(int i=s.length()-1;i>=0;i--)
{
	rev=rev+s.charAt(i);
}
if(s.equals(rev))
{
	return "palendrome";
}
else
{
	return "not a Palendrome";
}
}

public static void main(String[]args)
{
	String b= ispalendrome("manam");
	System.out.println(b);
}
}