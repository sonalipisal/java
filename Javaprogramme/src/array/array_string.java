package array;

import java.util.Arrays;

public class array_string 
{
public static void main(String[] args) 
{
	
	//declaration
	int arr[]= new int[4];
	
	//initiliazation
	arr[0]=1;
	arr[1]=3;
	arr[2]=2;
	arr[3]=4;
	
	//usage
	
	//System.out.println(arr.length);
	Arrays.sort(arr);
	for(int i=3; i>=0;i--)
		
	{
		System.out.println(arr[i]);
	}
	
	
			
}
}
