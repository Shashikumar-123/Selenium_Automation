package Practice;

import java.security.KeyStore.Entry;
import java.util.LinkedHashMap;

public class Dummy {

	public static void main(String[] args) {
		String s="shashikumar";
	
LinkedHashMap<Character,Integer> lhm = new LinkedHashMap<Character,Integer>();
for(int i=0;i<s.length();i++)
{
  char ch = s.charAt(i);
  if (!lhm.containsKey(ch))
  {
	  lhm.put(ch,1);
  }
  else
  {
	   int b = lhm.get(ch);
	   b++;
	   lhm.put(ch, b);
  }
}
	
for(java.util.Map.Entry<Character, Integer>p:lhm.entrySet())
{
	System.out.print(p.getKey());
			System.out.print(p.getValue());
	
}}

}