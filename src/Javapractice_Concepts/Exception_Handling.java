package Javapractice_Concepts;

public class Exception_Handling {

	static void job()throws EducationException
	{
		String qualification="Bsc";
		if(qualification=="Bsc")
		{
			System.out.println("elegible");
		}
		else
		{
			throw new EducationException("not elegible");
		}
	}
	public static void main(String[] args) {
		try
		{
			job();
		}
		catch(EducationException e)
		{
			System.out.println(e.getmsg());
		}
finally
{
	System.out.println("finally got job");
}
	}

}
