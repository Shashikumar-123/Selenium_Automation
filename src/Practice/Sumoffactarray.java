package Practice;

public class Sumoffactarray {

	public static void main(String[] args) {
int []arr={1,2,3};
int sum=0;
for(int i=0;i<arr.length;i++)
{
sum	= sum+ factorial(arr[i]);
}
System.out.println(sum);
	}
static int factorial(int a)
{
	int fact=1;
	for(int i=a;i>=1;i--)
	{
		fact=fact*i;
	}
	return fact;
}
	}


