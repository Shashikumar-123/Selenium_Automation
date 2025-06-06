package Javapractice_Concepts;

import java.util.HashMap;
import java.util.Map.Entry;

public class Hash_map {

	public static void main(String[] args) {
HashMap<String,Integer>h=new HashMap<String,Integer>();
h.put("dob", 15);
h.put("age", 27);
h.put("ag", 26);
for(Entry<String,Integer>o:h.entrySet())
{
	System.out.print(o.getKey()+""+o.getValue()+" ");
}}}