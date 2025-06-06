package Practice;

public class Casesensitive {

	public static void main(String[] args) {
String s= "sHaShI";
for(int i=0;i<=s.length()-1;i++)
{
char ch = s.charAt(i);
if(ch>=65 && ch<=90)
{
	System.out.print((char)(ch+32));
	}
else
{
	System.out.print((char)(ch-32));
}

}}}
