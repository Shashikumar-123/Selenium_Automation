package Practice;

 class Topcast {
	protected static  void dist()

	 {
		 System.out.println("This is super class");
	 }
 }
class Downcas extends Topcast
{
	protected static void call()
	{
		System.out.println("This is sub class");
	}
}
public class Upcast
{
	public static void main(String[]args)
		{
Topcast t = new Downcas();
 Downcas s = (Downcas) t;
 s.dist();
 s.call();
 

		}}