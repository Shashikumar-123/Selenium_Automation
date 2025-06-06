package Javapractice_Concepts;

import java.util.ArrayList;

public class Remove_Repeated_elements_givenarray {
	public static void main(String[] args) {
		
		int []a= {10,20,10,30,40};
		ArrayList ar=new ArrayList();
		for(int i=0;i<a.length;i++)
		{
		int n=a[i];
		if(!ar.contains(n))
		{
			ar.add(n);
		}}
		for(Object o:ar)
		{
			System.out.print(o+" ");
		}
	}}