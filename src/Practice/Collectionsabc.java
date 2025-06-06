package Practice;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.TreeSet;

public class Collectionsabc {
	public static void main(String[] args) {
		
		
		//HashSet q = new HashSet();
		//PriorityQueue q=new PriorityQueue();
		//TreeSet q = new TreeSet();
		LinkedHashSet q= new LinkedHashSet();
		q.add(10);
		q.add(200);
		q.add(3);
		q.add(1);
		
		
	
		//q.add(null);
		q.add(1);
		q.add(18);
		//q.add("shashi");
		System.out.println(q);
System.out.println(q.size());
//System.out.println(q.contains("shashi"));
	System.out.println(q.remove(200));
	System.out.println(q);
	q.removeAll(q);
	System.out.println(q);
	q.add(0);
	System.out.println();

		
		
	}

}
