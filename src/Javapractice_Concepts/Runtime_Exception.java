package Javapractice_Concepts;

public class Runtime_Exception {

	public static void main(String[] args) {
		/*
		System.out.println("main start");
		try {
int a=10/0;
		}
		catch(ArithmeticException a)
		{
			System.out.println("handled");
		}
System.out.println("main ends");
	}

}

		System.out.println("main starts");
		try {
		int [] a= {10,29,39};
		System.out.println(a[5]);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			
			System.out.println("main ends");
		}
		finally
		{
			System.out.println("this is final");}}
		}
		*/
		
		System.out.println("main starts");
		{
			try {
int age=8;
manage (age);
		}
			catch(IllegalArgumentException e)
			{
				System.out.println("age must be 21");
			}
		}	
			}
static void manage(int age)
		{
			if(age>=21)
			{
				System.out.println(" elegible");
			}
			else
			{
				throw new IllegalArgumentException();
			}
		
	}}
