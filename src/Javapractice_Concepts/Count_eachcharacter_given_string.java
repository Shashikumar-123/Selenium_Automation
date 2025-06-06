package Javapractice_Concepts;

import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class Count_eachcharacter_given_string {

	public static void main(String[] args) {
String s="shashikumar_bajanthri";
LinkedHashMap<Character,Integer> h=new LinkedHashMap<Character,Integer>();
for(int i=0;i<s.length();i++)
{
	char ch=s.charAt(i);
	if(!h.containsKey(ch))
	{
		h.put(ch,1);
	}
	else
	{
	int d=h.get(ch);
	d++;
	h.put(ch,d);
	}
}
//System.out.println(h);
for(Entry<Character, Integer> f:h.entrySet())
{
	System.out.print(f.getKey()+""+f.getValue() +" ");
}
	}}

