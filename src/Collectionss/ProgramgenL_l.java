package Collectionss;

import java.util.LinkedList;

public class ProgramgenL_l {

	public static void main(String[] args) {
LinkedList l =new LinkedList();
l.add(10);
l.add(23);
l.add(98);
System.out.println(l);

LinkedList l2 =new LinkedList();
l2.add(123);
l2.addAll(l);
System.out.println(l2);
System.out.println(l2.contains(98));



	}

}
