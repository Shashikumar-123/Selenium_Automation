package Abstraction;

abstract class Home {
abstract void apple();
abstract void orange();
}
abstract class Guest1 extends Home//internally abstract methods present
{
	void apple()
	{
		System.out.println("apple juice");
	}
}
class Guest2 extends Guest1
{
	void orange()
	{
		System.out.println("orange juice");
	}
}
