package Practice;

public class Count_ovl_con {

	public static void main(String[] args) {
String s=" bajanthri SHASHI Khikumar ";
int ovlcount=0;
int concount=0;
int spacecount=0;
for(int i=0;i<=s.length()-1;i++)
{
char ch=s.charAt(i);
if (ch==' ')
{
	spacecount++;
}


	if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
	{
		ovlcount++;
	}
	else
	{
		concount++;
	}
	
}
System.out.println(ovlcount);
System.out.println(concount);
System.out.println(spacecount);
System.out.println(s.length());
System.out.print(s.trim().length());
	}

	}
