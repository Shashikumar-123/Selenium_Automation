package Bobble_sort;

public class Fetchh {

	public static void main(String[] args) {
int []arr= {12,54,43,78,2};
int large = arr[0];
int n= arr.length;
for(int i=0;i<n;i++)
{
	if(arr[i] < large)
	{
		large = arr[i];
	}
}
System.out.println(large);
}}