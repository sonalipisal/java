package constructor;

public class const_parameter 
{
	String sname;
	int a;
	int b;
	int c;
	
	const_parameter()
	{
		sname="sonali";
		
	}
	const_parameter(int p1,int p2)
	{
		a=p1;
		b=p2;
		c=a+b;
		
	}
	
	
public static void main(String[] args) 
{
	const_parameter s1=new const_parameter();
			s1.m1();
	const_parameter s2=new const_parameter(10,20);
			s2.m2();
}


public void m1()
{
	System.out.println("Hello");
	System.out.println("Good morning");
	System.out.println(sname);
	
}


public void m2()
{
	System.out.println("answer="+c);
    //int sum = a+b;
	//System.out.println("ANS:"+sum);
	
}
}
