package sunday;

public class const1
{
	String name;
	int a;
	int b;
	int c;
	
	const1()
	{
		name="Sonali";
	}
	const1(int x,int y)
	{
		a=x;
		b=y;
		c=x+y;
		
	}
public static void main(String[] args) 
{
	const1 son=new const1(10,30);
	son.m1();
	
	const1 son1=new const1();
	son1.m2();
	
	
	
}
public void m1()
{
	

	System.out.println(c);
}
public void m2()
{
	System.out.println(name);
}
}
