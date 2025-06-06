package ExceptionHandling;


public class Box 
{
	static void lunch() throws BreakfastException
{
	int age=15;
	if(age>=18)
	{
		System.out.println("eat");
	}
	else
	{
		throw new BreakfastException("not time to ear"); 
	}}


	public static void main(String[] args) {
		try
		{
			lunch();
		}
	catch (BreakfastException e)
	{
		System.out.println(e.getmsg());
	}
	}}
