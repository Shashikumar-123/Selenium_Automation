package Practice1;

public class ReverseString {
	static String abc(String s)
	{
		String rev="";
		for(int i=s.length()-1;i>=0;i--)
		{
			rev=rev+s.charAt(i);
		}
		return rev;
	}
	public static void main(String[] args) {
		String v= abc("shashi");
		System.out.println(v);
	}
}