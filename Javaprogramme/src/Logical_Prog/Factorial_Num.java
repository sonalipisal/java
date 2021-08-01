package Logical_Prog;

public class Factorial_Num
{
public static void main(String[] args) {
	//5*4*3*2*1==120
	
	int num=5;
	int fact=1;
	       
	        //5      5 4 3 2 1>=1   5-- 4 3 2 1
	for(int i=num;   i>=1;        i--)
	{
		     //120*1=120
		     //60*2=120
		     //20*3=60
		    //5*4=20
            //1*5=5
	  fact=fact*i;	
	}
	System.out.println(fact);
}
}
