package Practice1;

public class Arrayelementsinreverse {

	public static void main(String[] args) {
int []arr= {10,23,43,2,1};
for(int i=arr.length-1;i>=0;i--)
{
	if(arr[i]%2==0)
	{
		System.out.println(arr[i] + " even");
	}
	else
	{
		System.out.println(arr[i]+ " odd");
	}
	}

}}