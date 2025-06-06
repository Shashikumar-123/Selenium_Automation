package Javapractice_Concepts;

class laptop
{
	void load(String s)//loading
	{
		System.out.println("this is load");
	}
	void dell()
	{
		System.out.println("500 ssd");
	}
void lenova ()
{
System.out.println("i5");	
}
}
class mobile extends laptop
{
	void load(String s,int b)//loading
	{
		System.out.println("both string and int");
		super.load(s);
	}
	void dell()
	{
		System.out.println("500 ssd with i8");
		super.dell();
	}
	
	void lenova()
	{
		System.out.println("550 ssd with i10");
	}
}

public class Methodover_riding {

	public static void main(String[] args) {
		
mobile m=new mobile();
m.dell();
m.lenova();//riding
m.load("execute");//loading
m.load("string",21);// loading
	}

}
