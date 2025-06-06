package Practice;

public class Spacecount {

	public static void main(String[] args) {
String s = "   Hi good morning";
int count =0;
for(int i=0;i<s.length();i++)
{
	char str = s.charAt(i);
	if(str==' ')
	{
	count++;	
	}
}
System.out.println(count);

	}

}
