package Practice1;

public class Factorial_of_given_array {
public static void main(String[] args) {
	int[]arr= {5,10,15,20};
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
		fact=fact*i;
	}
	System.out.println("factorial"+fact);
}
}
