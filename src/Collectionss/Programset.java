package Collectionss;

import java.util.HashSet;
import java.util.PriorityQueue;

public class Programset {

	public static void main(String[] args) {
HashSet s = new HashSet();
s.add(10);
s.add(20);
s.add(null);
s.add(5);
s.add(7);
s.add(1);
s.add("shashi");

System.out.println(s);
System.out.println(s.contains("shashi"));
s.remove(null);
System.out.println(s);
s.removeAll(s);
System.out.println(s);

	}

}
