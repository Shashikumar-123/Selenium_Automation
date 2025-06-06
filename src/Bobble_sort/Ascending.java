package Bobble_sort;

public class Ascending {

	public static void main(String[] args) {
int[] arr = {9,7,2,3,1};
 int n = arr.length;
 for(int i=0;i<n-1;i++)
 {
	 for (int j=0;j<n-1;j++)
	 {
		 if(arr[j]> arr[j+1])
		 {
			 int temp = arr[j];
			 arr[j] = arr[j+1];
			 arr[j+1] = temp;
		 }
	 
	 }}

 for(int k=0;k<n;k++)
 {
	 System.out.print(arr[k]+"  ");
 }
	}
}

