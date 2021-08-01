package mock;

import java.util.Arrays;

public class ex2 
{
public static void main(String[] args)
{
    
    
    String str = "my name is sonali";
    
    char arr[] = str.toCharArray();

    for (int i=0; i < arr.length; i++)
    {
       if(i!=0)
       {
    	   if(arr[i-1]==' ')
    		   System.out.println(arr[i]);
       }
       else
    	   System.out.println(arr[i]);
    }

    
    }
    
  
    
    
   
}


