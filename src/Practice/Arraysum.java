package Practice;

public class Arraysum {
/*
	public static void main(String[] args) {
int[]a= {1,2,3,4,5};
int sum=0;
for(int i=0;i<=a.length-1;i++)
{
	sum = sum+a[i];
	}
System.out.println(sum);

}}
                                  parameter
	static void arr(int[]a)
	{
		int sum=0;
		for(int i=0;i<=a.length-1;i++)
		{
			sum=sum+a[i];
		}
		System.out.println(sum);
	}
	public static void main(String[]args)
	{
		int []a= {1,2,3,4,5};
		arr(a);
	}}
	
	
	*/
	int arr(int[]a)
	{
	int sum=0;
		for(int i=0;i<=a.length-1;i++)
		{
			sum=sum+a[i];
		}
		return sum;
}
	public static void main(String[]args)
	{
		int []a= {1,2,3,4,5,6};
		Arraysum s =new Arraysum();
		int cc = s.arr(a);
		System.out.println(cc);
	}
		
	}
	