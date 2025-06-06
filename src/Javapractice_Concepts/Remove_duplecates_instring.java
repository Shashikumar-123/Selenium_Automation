package Javapractice_Concepts;

import java.util.ArrayList;

public class Remove_duplecates_instring {

	public static void main(String[] args) {
String s="Java";
ArrayList ar=new ArrayList();
for(int i=0;i<s.length()-1;i++)
{
	char ch=s.charAt(i);
	if(!ar.contains(ch))
	{
		ar.add(ch);}
}
//System.out.println(ar);
for(Object o:ar)
{
	System.out.print(o+" ");
}
	}

}
