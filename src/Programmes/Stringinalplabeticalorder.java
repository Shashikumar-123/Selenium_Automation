package Programmes;

public class Stringinalplabeticalorder {
	public static void main(String[] args) {
String s="shashikumar";
char[] ch= s.toCharArray();
alphabatic(ch);
	}
static void alphabatic(char[]ch)
{
	for(int i=0;i<ch.length;i++)
	{
		for(int j=0;j<ch.length-1;j++)
		{
			if (ch[j]>ch[j+1])
			{
				char temp = ch[j];
				ch[j]= ch[j+1];
				ch[j+1]=temp;
				
			}
		}
	}
	
//String a = new String(ch);
	//or
	System.out.println(ch);
	
}

}
