package Logical_Prog;

public class Reverse_string
{
public static void main(String[] args) {
	
	String str="sonali nitali";
	String[] ar=str.split(" ");
	
	
	for(int i=0;i<=ar.length-1;i++)
	{
		if(i%2==0)
		{
			String s1=ar[i];
			ar[i]=reverseString(s1);
		}
	}
	for(int i=0; i<=ar.length-1;i++)
	{
		System.out.println(ar[i]);
	}
}
 public static String reverseString(String inp )
 {
	 
	 String rev="";
	 for(int i=inp.length()-1;i>=0;i--)
	 {
		rev=rev+inp.charAt(i); 
	 }
	return rev;
	 
 }

}
