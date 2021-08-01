package fresh;

public class variable_types 
{
	int c=40;  //global 
	static int b=20;  //static  variable
public static void main(String[] args)
{
	variable_types  s1=new variable_types ();
	s1.m1();
	System.out.println(b);
	
}
public void m1()
{
	int i=10;  //local variable
	System.out.println(i);
	System.out.println(b);
	System.out.println(c);
}


}
