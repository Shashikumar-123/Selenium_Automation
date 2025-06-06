package ExceptionHandling;

public class Login {
	static void enter()throws ShadiException
	{
		int age=21;
		if(age <=18)
		{
			System.out.println("not allowed");
		}
		else 
		{
			throw new ShadiException("allowed");
		}

		
	}
	public static void main(String[]args)
	{
		try {
			enter();
		} catch (ShadiException e) {
			System.out.println(e.getmsg());
		}
		finally
		{
			System.out.println("unable to login till age becomes 21");
		}
	}

}
