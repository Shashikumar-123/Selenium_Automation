package Practice;

public class Factorial {
	int abc(int a,int b) 
	{
		int fact=1;
for(int i=a;i>=b;i--)
{
	fact= fact*i;
}
return fact;
}
	public static void main(String[] args) {
Factorial f = new Factorial();
		int bn = f.abc(10,1);
System.out.println(bn);
	}
}
