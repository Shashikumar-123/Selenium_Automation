package ExceptionHandling;

public class Travel {
	static void journey()throws CancelException
	{
	int amount=150;
	if(amount>300)
	{
		System.out.println("reach destination");
	}
	else
	{
		throw new CancelException("reject destination");
	}
	}
	public static void main(String[] args) {
		try
		{
			journey();
		}
		catch(CancelException e)
		{
			System.out.println(e.getmsg());	
	}
		finally
		{
			System.out.println("got gd package");
		}

	}

}
