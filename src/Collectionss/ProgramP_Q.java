package Collectionss;

import java.util.PriorityQueue;

public class ProgramP_Q {

	public static void main(String[] args) {
PriorityQueue p = new PriorityQueue();	
p.add(10);
p.add(20);
p.add(5);
p.add(7);
p.add(1);

System.out.println(p);
System.out.println(p.contains(20));
System.out.println(p.peek());
System.out.println(p);
System.out.println(p.poll());
System.out.println(p);
p.removeAll(p);
System.out.println(p);

}
}
