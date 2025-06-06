package Practice;

public class Fctorialnum {

	public static void main(String[] args) {
int []arr= {3,2,100,5,10};
for(int i=0;i<arr.length;i++)
{
factorial(arr[i]);
}
	}
	static void factorial(int a)
	{
		int fact=1;
		for(int i=a;i>1;i--)
		{
			fact = fact*i;
		}
		System.out.println(fact);
	}

}
