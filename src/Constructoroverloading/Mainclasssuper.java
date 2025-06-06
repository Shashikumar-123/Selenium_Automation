package Constructoroverloading;

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

class Tester extends Sample
{
	Tester (int a, String s)
	{
		super("hello");
		System.out.println(a+"  " +s);
	}
}
public class Mainclasssuper {

	public static void main(String[] args) {
Tester t = new Tester(10,"hello");
	}

}
