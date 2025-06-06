package Programmes;

public class Factorialofgivenarray {

	public static void main(String[] args) {
		int []arr = {2,4,6,8,3};
for(int i=0;i<arr.length;i++)
{
	abc(arr[i]);
}}
static void abc(int arr)
{
	int fact=1;
	for(int i=arr;i>1;i--)
	{
		fact=fact*i;
	}
System.out.println(fact);
}}