package Javapractice_Concepts;

 class Method_overloading1
{
	static void splendor(String a)
	{
		System.out.println("Handle");
	}
	static void splendor(String b, String c)
	{
		System.out.println("Handle"+"Silencor");
		
	}
	static void splendor(String c, String d,String e)
	{
		System.out.println("Handle"+"Silencor"+"paint");

	}}
	class Method_overloading2 extends Method_overloading1
	{
	static void splendor1(String a)
	{
		System.out.println("Handlebar");
	}
	static void splendor1(String b, String c)
	{
		System.out.println("Handle"+"Silencor");
		
	}}
	public class Method_overloading
	{
	public static void main(String[] args) {
		Method_overloading2.splendor1("Handle bar black");
	}

}
