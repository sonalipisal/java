package mock;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ex1_array 
{
public static void main(String[] args) 
{
	String ar[]=new String[5];
	
	ar[0]="Sonali";
	ar[1]="Nitali";
	ar[2]="Ganesh";
	ar[3]="Abhi";
	ar[4]="Dev";
	
	//System.out.println(ar[1]);
			
//	for(int i=0;i<=2;i++)
//	{
//		System.out.println(ar[i]);
//	}
	
//	for(int i=0;i<=ar.length-1;i++)
//	{
//		System.out.println(ar[i]);
//	}
	
//reverse order
//	for(int i=2;i>=0;i--)
//	{
//		System.out.println(ar[i]);
//	}
	
	//asending
	Arrays.sort(ar);
	for(int i=0;i<=4;i++)
	{
		System.out.println(ar[i]);
	}
	//desending
	
	for(int i=4;i>=0;i--)
	{
		System.out.println(ar[i]);
	}
}
}
