package Practice1;

public class Separate_Alphabets_numbers_specialcharacters {

	public static void main(String[] args) {
String s="shashi123@sipl.co.in";
String alpha=" ";
String numbers=" ";
String Spec_char=" ";
for(int i=0;i<s.length();i++)
{
char ch=	s.charAt(i);
if(Character.isAlphabetic(ch))
{
	alpha=alpha+ch;
}
else if(Character.isDigit(ch))
{
	numbers=numbers+ch;
}
else
{
	Spec_char=Spec_char+ch;
}}
System.out.println(alpha);
System.out.println(numbers);
System.out.println(Spec_char);

}

	}


