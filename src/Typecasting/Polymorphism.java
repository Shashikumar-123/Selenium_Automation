package Typecasting;

public class Polymorphism {
static void send(int a)
{
	System.out.println(a);
}
static void send(int a,int b)
{
	System.out.println(a+b);
}
static void send(String s)
{
	System.out.println("Hello");
}
	public static void main(String[] args) {
send(10);
send(10+19);
send("Heello");


	}

}
