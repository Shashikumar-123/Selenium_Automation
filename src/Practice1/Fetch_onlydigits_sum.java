package Practice1;

public class Fetch_onlydigits_sum {
	static String fetch(String s)
	{
		String digit="";
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			if(Character.isDigit(ch))
			{
			digit =digit+ch;			
		}}
		return digit;
	}
	static int sumi(int n)
	{
		int sum=0;
		while(n!=0)
		{
	int rem=n%10;
	sum=sum+rem;
n=	n/10;
		}
return sum;
		}
	
	public static void main(String[] args) {
		String s="sthhjoa76";
		String dig=fetch(s);
		
		int no=Integer.parseInt(dig);
		int sum=sumi(no);
		System.out.println(sum);
	}}
	


