package Practice;

public class Ascend {

	public static void main(String[] args) {
int[]arr= {9,10,6,2,1};
int n = arr.length;
for(int j=0;j<n-1;j++)
{
	for(int i=0;i<n-1;i++)
	{
		if(arr[i]<arr[i+1])
		{
			int temp = arr[i];
			arr[i]=arr[i+1];
			arr[i+1]=temp;
		}
	}}
	for(int k=0;k<n;k++)
	{
		System.out.print(arr[k]+"  ");
	}

	}

}
