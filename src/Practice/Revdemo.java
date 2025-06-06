package Practice;

public class Revdemo {

	static String reverse(String s)
	{
		String rev="";
		for(int i=s.length()-1;i>=0;i--)
		{
			rev = rev+s.charAt(i);
		}
		return rev;
	}
	
static void reversesent(String s)
{
	String[] str = s.split("");
	for(int i=str.length-1;i>=0;i--)
	{
		if(i==1)
		{
			System.out.print(str[i]);
		}
		else
		{
			System.out.print(str[i]+"");
		}
	}
}
	public static void main(String[] args) {
String s ="Hi good morning";
reversesent(s);
	}

}
