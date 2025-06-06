package Javapractice_Concepts;

import java.util.HashMap;
import java.util.Scanner;

public class Add_datausing_scanner_class {

	public static void main(String[] args) {
		System.out.println("enter");
		Scanner sc=new Scanner(System.in);
		HashMap<String,Integer> h =new HashMap<String,Integer>();
		for(int i=0;i<3;i++)
		{
		String s=sc.next();	
	int	n = sc.nextInt();
	h.put(s,n );
	System.out.println(h);
		}}
	}

