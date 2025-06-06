package Arrayprogrammes;

public class Mulofarraypara {

static void mul (int[]a)
{
	int product = 1;
	for(int i=0;i<=a.length-1;i++)
	{
		product = product*a[i];
	}
	System.out.println(product);
}
	public static void main(String[] args) {
	int [] a= {1,2,3,4,5};
	mul(a);

	}

}
