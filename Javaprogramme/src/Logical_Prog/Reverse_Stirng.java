package Logical_Prog;

public class Reverse_Stirng 
{
public static void main(String[] args) {
	
	
	//String org="sonali";
	String s1="mumbai to pune";
	String rev="";
	
	for(int i=s1.length()-1;i>=0;i--)
	{
		rev=rev+s1.charAt(i);
	}
	System.out.println(rev);
}
}
