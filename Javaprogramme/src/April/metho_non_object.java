package April;

public class metho_non_object
{

	public static void main(String[] args)
	{
		System.out.println("main method started");
		
	// create object class name object name =new class name()
		metho_non_object s4=new metho_non_object();
		
		s4.m1();
		s4.m2();
		s4.m3();
		
		System.out.println("main method ended");
	}
	
	// non static method 
	public void m1()
	{
		System.out.println("Non static regular method");
	}
	public void m2()
	{
		System.out.println("non static reagular method with diff class:--m2");
	}
	
	public void m3()
	{
		System.out.println("non static reagular method with diff class:--m3");
	}
}
  