package exception_handle;

public class Arithmetic
{
	public static void main(String[] args) {
		int a=10;
		int b=0;
		int c=0;
		try 
		{
			 c=a/b;   ///risky code
		}
		catch(Exception e)
		{
			c=a/1;
			e.printStackTrace();
			System.out.println(" Exception Handled");
		}
		System.out.println(c);
		System.out.println("hi");
		
	}

}
