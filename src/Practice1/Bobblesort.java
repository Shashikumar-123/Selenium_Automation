package Practice1;

public class Bobblesort {

	public static void main(String[] args) {

int []a= {12,100,6,18,1};
int s=a.length;
for(int i=0;i<s-1;i++)
{
	for(int j=0;j<s-1;j++)
	{
		if(a[j]>a[j+1])
		{
			int temp=a[j];
			a[j]=a[j+1];
			a[j+1]=temp;
		}
						}
	}
for(int k=0;k<s;k++)
{
	System.out.print(a[k]+" ");
}}}