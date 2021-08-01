package Logical_Prog;

import practice.main;

public class palindrome 
{
public static void main(String[] args) {
	
	String org="madamf";//madam,civic,noon,level,radar,tenet,refer
	String rev="";
	
	for(int i=org.length()-1;i>=0;i--)
	{
		rev=rev+org.charAt(i);
	}
	if(org.equals(rev))
	{
		System.out.println("this is polindrome");
	}
	else
	{
		System.out.println("not palindrome");
	}
}
}
