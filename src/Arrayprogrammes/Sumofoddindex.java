package Arrayprogrammes;

public class Sumofoddindex {

	public static void main(String[] args) {
int [] a= {1,2,3,4,5,6};
int sum = 0;
for(int i=0;i<=a.length-1;i++)
	if(a[i]%2==1)
	{
		sum=sum+a[i];
	}
System.out.println(sum);
	}

}
