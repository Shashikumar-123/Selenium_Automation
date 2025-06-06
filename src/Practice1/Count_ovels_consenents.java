package Practice1;

public class Count_ovels_consenents {

	public static void main(String[] args) {
		String s="Shashi as Automation tester";
		/*int ovel_count=0;
		int con_count=0;
		for(int i=0;i<s.length()-1;i++)
		{
		char ch=s.charAt(i);
		if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
		{
			ovel_count++;
		}
		else
		{
			con_count++;
		}
	}
		
		System.out.println("ovel_count"+ovel_count);
		System.out.println("con_count"+ con_count);
}
}
		*/
		int space_count=0;
		for(int i=0;i<s.length()-1;i++)
		{
char ch=s.charAt(i);
if(ch==' ')
{
	space_count++;
}}
System.out.println("space_count"  + space_count);
		}}