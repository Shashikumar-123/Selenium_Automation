package Javapractice_Concepts;

import java.util.ArrayList;
import java.util.TreeSet;

public class Convert_Listtoset {

	public static void main(String[] args) {
ArrayList<Integer> al=new ArrayList<Integer>();
al.add(100);
al.add(10);
al.add(101);
al.add(100);
System.out.println(al);
TreeSet<Integer> s=new TreeSet<Integer>(al);
System.out.println(s);
	}

}
