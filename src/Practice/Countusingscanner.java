package Practice;

import java.security.KeyStore.Entry;
import java.util.LinkedHashMap;
import java.util.Scanner;

public class Countusingscanner {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		LinkedHashMap<Character,Integer>l=new LinkedHashMap<Character,Integer>();
		String s=sc.next();
		for(int i=0;i<s.length();i++){
		char ch= s.charAt(i);
		if(!l.containsKey(ch))
		{
			l.put(ch,1);
		}
		else
		{
			int n=l.get(ch);
			n++;
			l.put(ch,n);
		}
		}
		for(java.util.Map.Entry<Character,Integer> o:l.entrySet())
		{
			
			
			System.out.println(o.getKey()+" "+ o.getValue());
			
		
		}
		
		}

}
