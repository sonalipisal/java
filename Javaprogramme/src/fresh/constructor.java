package fresh;

public class constructor 
{
	int a;
	int b;
	int c;
	
	
	public static void main(String[] args) 
	{
		constructor s1=new constructor(100,20);
		s1.m1();
		constructor s2=new constructor(100,20,30);
		s2.m2();
	}
	constructor(int x,int y)
	{
		a=x;
		b=y;
	}
	constructor(int x,int y,int z)
	{
		a=x;
		b=y;
		c=z;
	}
	public void m1()
	{
		int c=a+b;
		System.out.println(c);
		
	}
	public void m2()
	{
		
		int d=a+b+c;
	    System.out.println(d);
	}
	
}


