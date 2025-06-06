package Practice;


	class Demo
	{
		Demo(int a)
		{
			System.out.println(a);
		}
	}
	class Sample extends Demo
	{
		Sample(String s)
		{
			super(10);
			System.out.println(s);
		}
	}
	class Dev extends Sample
	{
		Dev(char c)
		{
			super("hello");
			System.out.println(c);
		}
	}

	class Tester extends Dev
	{
		Tester(int a, String s,char c)
		{
			super('a');
			
			System.out.println(a+"  " +s);
		}
	}
	public class Consoverload {

		public static void main(String[] args) {
	Tester t = new Tester(10,"hello",'r');
		}

	}

