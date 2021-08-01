package Logical_Prog;

import java.util.Arrays;

public class Compare_Array 
{
public static void main(String[] args) 
{
	int arr1[]= {2,3,4};
	int arr2[]= {5,6,7};
	int arr3[]= {2,3,4};
	
	System.out.println(Arrays.equals(arr1, arr2));//false 1&2  not match
	System.out.println(Arrays.equals(arr1, arr3));//true 1&3 match
}
}
