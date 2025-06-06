package Javapractice_Concepts;

public class Threads_sample implements Runnable {
public void disp()
{
	for(int i=0;i<5;i++)
	{
		System.out.println("Hlo"+" ");
	

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
}}
public void run()
{
	for(int i=0;i<8;i++)
	{
		System.out.println(i+" ");
	
	try {
		Thread.sleep(1000);
	} catch (InterruptedException e) {
		e.printStackTrace();
	}
}}
	
	public static void main(String[] args) {
		Threads_sample ts= new Threads_sample();
		Thread t=new Thread(ts);
		Runnable r=t;
		t.start();
		
		ts.disp();

	}

}
