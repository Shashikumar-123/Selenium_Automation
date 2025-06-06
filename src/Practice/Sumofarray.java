package Practice;

public class Sumofarray {
	int arr(int []a)
	{
	int sum=0;
	for(int i=0;i<=a.length-1;i++)
	{
		sum=sum+a[i];
	}
	return sum;
	
}
	public static void main(String[] args) {
int[]a= {1,2,3,4};
Sumofarray ss = new Sumofarray();
int ew = ss.arr(a);
System.out.println(ew);
	}
	

}
