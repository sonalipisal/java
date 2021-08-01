package Logical_Prog;

public class Armstrong 
{
public static void main(String[] args) {
	
	int orgNum=370;
	int sum=0;
	
	for(int i=orgNum; i>0; i=i/10)
	{
		int rem=i%10;
		sum=sum+(rem*rem*rem);
		
	}
	if(orgNum==sum)
	{
		System.out.println("Given number is an armstrong:"+orgNum);
	}
	else
	{
		System.out.println("Given number is not armstrong:"+orgNum);
	}
}
}
