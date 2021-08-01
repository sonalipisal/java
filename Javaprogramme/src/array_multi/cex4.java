package array_multi;

public class cex4
{
public static void main(String[] args)
{
	String str = "My Name is Sonali";
    char arr[] = str.toCharArray();
    
   for(int i=0;i<arr.length;i++)
   {
	   if(i==0)
	   {
		   System.out.println(arr[i]);
	   }
	   else
	   {
		   if(arr[i-1]==' ')
			   System.out.println(arr[i]);
	   }
   }
	
}
}
