package Javapractice_Concepts;

import java.util.Scanner;

public class Scannerclass {

	public static void main(String[] args) {
Scanner sc = new Scanner(System.in);

/*
System.out.println("enter input");
String v=sc.next();
System.out.println(v);
char c=v.charAt(3);
System.out.println(c);}}
*/
System.out.println("enter size");
int d=sc.nextInt();
System.out.println("enter data");
   int [] a=new int[d];
   for(int i=0;i<d;i++)
   {
a[i]=sc.nextInt();
}
   for(int o:a)
   {
	  System.out.print(o+" ");
   }}}
