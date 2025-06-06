package ExceptionHandling;

public class Matrimony {
	static void elegible()throws SalaryException
	{
		int sal=10000000;
		if(sal<1000000)
		{
			System.out.println("you are elegible");
		}
		else 
		{
			throw new SalaryException("no job");
		}
	}

	public static void main(String[] args) {
		try {
elegible();
	}
catch(SalaryException e)
		{
System.out.println(e.getclarification());
		}
		finally
		
		{System.out.println("will get soon");
	
		}
}
}