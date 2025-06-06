package Practice1;

public class Swap_2_strings {

	public static void main(String[] args) {
String a="shashi";
String b="kumar";
a=a+b;
//a=s.substring(6);
//b=s.substring(0,6)
b=a.substring(0,a.length()-b.length());
a=a.substring(b.length());
System.out.println("a"+a);
System.out.println("b"+b);
	}

}
