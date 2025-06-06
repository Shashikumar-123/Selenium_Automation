package Collectionss;

import java.util.TreeSet;

public class ProgramT_S {

	public static void main(String[] args) {
		TreeSet t  = new TreeSet();
		t.add(1);
		t.add(4);
		t.add(0);
		t.add(1);
		t.add(10);
		t.add(5);
		System.out.println(t);
		t.remove(4);
		System.out.println(t);
		System.out.println(t.contains(10));
		t.removeAll(t);
		System.out.println(t);




	}

}
