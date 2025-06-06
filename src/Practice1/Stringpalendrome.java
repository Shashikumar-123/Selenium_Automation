package Practice1;

public class Stringpalendrome {
	
static String abc(String s)
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
	return "not";
}
}
public static void main(String[] args) {
	String av=abc("manam");
	System.out.println(av);

}}
