package Practice1;

public class Reverse_array {

	public static void main(String[] args) {
int []arr= {1,32,34,2,43};
int i=0;
int j=arr.length-1;
while(i<=j)
{
	int temp=arr[i];
	arr[i]=arr[j];
	arr[j]=temp;
	i++;
	j--;
}
	for(int v:arr)
	{
		System.out.println(v);
	}}
	}