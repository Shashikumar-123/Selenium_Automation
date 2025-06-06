package Collectionss;

import java.util.Scanner;

public class Sample {

	public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.println("enter size");
int n = sc.nextInt();
System.out.println("enter elements");
int[]a=new int[n];
for(int i=0;i<n;i++)
{
a[i]=sc.nextInt();
}
for(int i:a)
{
	System.out.println(i);
}
	}

}
