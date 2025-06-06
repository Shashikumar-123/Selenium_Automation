package Interface;

public interface exampleprogram {
	void disp();
	void print();
}
abstract class abc implements exampleprogram
{
	public void disp()
	{
		System.out.println("Hello");
	}
}
class def extends abc
{
	public void print()
	{
		System.out.println("Bye");
	}
}
