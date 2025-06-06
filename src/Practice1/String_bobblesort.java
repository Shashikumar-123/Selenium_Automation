package Practice1;

public class String_bobblesort {

	public static void main(String[] args) {
String s="shashi";
char []ch= s.toCharArray();
for(int i=0;i<ch.length-1;i++)
{
	for(int j=0;j<ch.length-1;j++)
	{
		if(ch[j]>ch[j+1])
		{
			char temp=ch[j];
			ch[j]=ch[j+1];
			ch[j+1]=temp;
		}
	}
}
String s1=new String(ch);
{
	System.out.println(s1);
}

	}

}
