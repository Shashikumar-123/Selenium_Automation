package Practice;

public class Stringswap {

	public static void main(String[] args) {
String s1="java";
String s2="mava";


s1=s1+s2;

s2=s1.substring(0,4);
s1=s2.substring(4);
System.out.println(s1);
System.out.println(s2);
	}

}
