package Filehandling;

public class Demothread implements Runnable {

public void disp()
{
	for(int i=0;i<10;i++)
	{
		System.out.println("hii"+" ");
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
public void run()
{
	for(int i=0;i<10;i++)
	{
		System.out.println(i+" ");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}}

	public static void main(String[] args) {
		Demothread d= new Demothread();
		Thread t= new Thread( d);
		Runnable r=t;
				t.start();
d.disp();
	
}}