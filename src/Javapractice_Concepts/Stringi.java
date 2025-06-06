package Javapractice_Concepts;

public class Stringi {

	public static void main(String[] args) {
String s="He is a boy";
String[] a=s.split(" ");
for(int i=0;i<a.length;i++)
{
	System.out.print(a[i]+" ");
}

String d="javamava";
System.out.println(d.substring(0,6));
System.out.println(d.substring(4));


}
}