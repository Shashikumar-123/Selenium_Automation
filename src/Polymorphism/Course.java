package Polymorphism;

public class Course {
	void study()
	{
		System.out.println("learnig course");
	}

}
class Java extends Course
{
	void study()
	{
		System.out.println("learnig java course");

	}
}
class Automation extends Course
{
	void study()
	{
		System.out.println("learnig automation course");

	}
}
class Api extends Course
{
	void study()
	{
		System.out.println("learnig api course");

	}
}
class Hr
{
	static void Qspiders(Course c)
	{
		c.study();
	}

}