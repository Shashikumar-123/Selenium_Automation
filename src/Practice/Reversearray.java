package Practice;

public class Reversearray {

	public static void main(String[] args) {
int [] arr= {3,2,100,5,10};
int i=0;
int j=arr.length-1;
while(i<=j)
{
	int temp= arr[i];
arr[i]=arr[j];
arr[j]=temp;
System.out.println(i);
System.out.println(j);
	}

}}
