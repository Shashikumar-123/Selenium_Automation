package Practice1;

public class Sum_of_factorial {

	public static void main(String[] args) {
int []arr= {2,3,5,4};
int sum=0;
for(int i=0;i<arr.length;i++)
{
	sum=sum+arr[i];
}
System.out.println(sum);
	}
	static int factorial(int a)
	{
		int fact=1;
		for(int i=a;i<1;i--)
		{
			fact=fact*i;
		}
		return fact;
	}

}
