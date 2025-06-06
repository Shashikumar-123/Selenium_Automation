package Practice1;

public class Reverseparticularindex {

	public static void main(String[] args) {
String s="Hlo good morning";
String [] str=s.split(" ");
for(int i=0;i<str.length;i++)
{
	if(i==1)
	{
		String rev="";
		for(int j=str[i].length()-1;j>=0;j--)
		{
	rev=rev+str[i].charAt(j);
	}
		System.out.print(rev+" ");
	}
	else
	{
	System.out.print(str[i]+" ");	
	}
		
}
}}