package Collectionss;

import java.util.ArrayList;

public class A_Lwrapclass {

	public static void main(String[] args) {
		ArrayList<Integer> a =  new ArrayList<Integer>();
		a.add(10);
		a.add(20);
		a.add(5);
		a.add(10);
		
		System.out.println(a);
		
		System.out.println(a.contains(5));
		System.out.println(a.remove(1));
		//a.removeAll(a);
		System.out.println(a);
		
		ArrayList<Integer> a2 =  new ArrayList<Integer>();
		a2.add(123);
		a2.addAll(a);
		System.out.println(a2);
		a2.addAll(0,a);
		System.out.println(a2);
		
	}

}
