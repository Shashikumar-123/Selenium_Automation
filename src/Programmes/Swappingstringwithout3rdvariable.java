package Programmes;

public class Swappingstringwithout3rdvariable {

	public static void main(String[] args) {
		
	/*	
		//if length knows this one
String s1="java";
String s2="mava";
s1=s1+s2;
System.out.println(s1);
s2=s1.substring(0,4);
System.out.println(s2);
s1=s1.substring(4);
System.out.println(s1+" " +s2);
	}

}

		//if we dontknow length
		String s1="shashi";
		String s2="kumar";
		
System.out.println(s1.length());
	System.out.println(s2.length());
		s1=s1+s2;
		
		System.out.println(s1.length());
		s2=s1.substring(0,6);
		System.out.println(s2);
		s1=s1.substring(6);
		System.out.println(s1);
		System.out.println(s1+" "+s2);
	}}
		*/
		
		String s1="shashi";
		String s2="kumar";
		s1=s1+s2;
	System.out.println(s1);
		int n=s1.length()- s2.length();
				s2=s1.substring(0,n);
		s1=s1.substring(n);
		System.out.println(s1+" "+s2);
	}}
		
		
		
		
		
		
		