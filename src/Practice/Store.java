package Practice;

public interface Store {
	void buy();

}
class Redmi1 implements Store
{
	 public void buy()
	{
		System.out.println("buying");
	}
	}
class Apple1 implements Store
{
	public void buy()
	{
		System.out.println("apple buying");
	}
}
class Custamer1
{
	static void got(Store s)
	{
		s.buy();
	}
}

