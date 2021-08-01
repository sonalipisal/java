package Logical_Prog;

public class mumbai 
{
public static void main(String[] args) {
	
	String str="mumbai to pune";
	
     String starr[]=new String[3];
	
	
    starr= str.split(" ");
    
    System.out.println(str);
	for(int i=starr.length-1;i>=0;i--)
	{ 
		
		System.out.print(starr[i]+" ");
	}
	
	
}
}
