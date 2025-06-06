package Abstraction;

abstract class Custamer
{
	abstract void booking();
}
class Scooter extends Custamer
{
	void booking()
	{
		System.out.println("Booking scooter");
	}
}
class Cngauto extends Custamer
{
	void booking()
	{
		System.out.println("Booking cngauto");
	}
}

class Cab extends Custamer
{
	void booking()
	{
		System.out.println("Booking Cab");
	}
}

class cust
{
	static void app(Custamer c)
	{
		c.booking();
	}
}
public class Uber {

	public static void main(String[] args) {
		Scooter sc = new Scooter();
			cust.app(sc);
	}

}
