package Practice1;

public class Largestno {

	public static void main(String[] args) {
int []a= {1,5,45,98};
int largest=a[0];//98
for(int i=0;i<a.length;i++)
{
	if(a[i]<largest)
	{
		largest=a[i];
	}}
	System.out.print(largest+" ");
}}


