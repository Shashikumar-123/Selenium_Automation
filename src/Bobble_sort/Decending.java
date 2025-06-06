package Bobble_sort;

public class Decending {

	public static void main(String[] args) {
int []arr = {20,34,73,9,123};
int n= arr.length;
for(int j=0;j<n-1;j++)
{
	for(int i=0;i<n-1;i++)
	{
		if (arr[i]<arr[i+1])
		{
			int temp = arr[i];
			arr[i]=arr[i+1];
			arr[i+1]=temp;
		}
	}
}
for(int k=0;k<n;k++)
{
	System.out.println(arr[k]);
}
	
}


}
