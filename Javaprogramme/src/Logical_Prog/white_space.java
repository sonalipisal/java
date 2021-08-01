package Logical_Prog;

public class white_space
{
public static void main(String[] args) 
{
	String str="a  bcd   ef g";
	int count=0;
	
	for(int i=0;i<=str.length()-1;i++)
	{
		char str1=str.charAt(i);
		if(str1==' ')
		{
			count++;
		}
		
	}
	System.out.println("number og given space:-"+count);
}
}
