package Programmes;

public class Sumofarraynum {

	public static void main(String[] args) {
int[]arr= {2,1,3,4};

  int sum=0;
 
for(int i=0;i<arr.length;i++)
{
	sum=sum+factorial(arr[i]);
}
System.out.println(sum);

	}
	static int factorial(int arr)
	{
		int fact=1;
		for(int i=arr;i>1;i--)
		{
			fact=fact*i;
		}
		return fact;
	}

}




