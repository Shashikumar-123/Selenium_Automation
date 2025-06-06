package Practice1;

public class Character_low_to_up {

	public static void main(String[] args) {
String s="sHaShI";
for(int i=0;i<s.length();i++)
{
	char ch=s.charAt(i);
	if(ch>=65 & ch<=90)
	{
		System.out.println((char)(ch+32));
	}
	else if(ch>=97 & ch<=122)
	{
		System.out.println((char)(ch-32));
		
	}
}
	}

}
