package constructor;

public class sample1 
{
	String name;
	int id;
	int num1;
	int num2;
	int num3;
	
	sample1(String a,int b)
	{
		name=a;
		id=b;
	}
	sample1(int a,int b, int c)
	{
		num1=a;
		num2=b;
		num3=c;
	}
	
	
	
public static void main(String[] args) {
	 sample1 s1=new sample1("sonali",1);
	 
	 sample1 s2=new sample1(10,20,10);
	 s1.m1();
	 s2.m2();
	 
	
	 }
public void m1()
{
	System.out.println(name+id);
	
}
public void m2()
{
	
}
}
