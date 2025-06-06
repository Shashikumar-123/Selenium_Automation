package Javapractice_Concepts;

import java.util.ArrayList;
import java.util.Collections;

public class Collectionss {

	public static void main(String[] args) {
ArrayList<Integer>a=new ArrayList<Integer>();
a.add(100);
a.add(2);
a.add(4);
a.add(10);
a.add(2);
System.out.println(a);
Collections.sort(a.reversed());
System.out.println("after sorting");
for(int o:a)
{
	System.out.print(o+" ");
}
	}

}
