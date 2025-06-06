package Practice;

public class Sting {
	public static void main(String[]args)
	{
		String s = "mobile";
		String s2= new String("Mobile");
		System.out.println(s.length());
		System.out.println(s.charAt(3));
		System.out.println(s.toUpperCase());
		System.out.println(s.toLowerCase());
		System.out.println(s.equals(s2));
		System.out.println(s.equalsIgnoreCase(s2));
		
		for(int i=0;i<=s.length()-1;i++)
		{
			System.out.println(s.charAt(i));
	}
}
}