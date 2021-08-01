package exception_handle;

public class array_exception
{
	public static void main(String[] args) {
		
		int ar[]=new int[5];
		try
		{
			ar[6]=10;
		}
		catch(ArrayIndexOutOfBoundsException A)
		{
			
			System.out.println("ArrayIndexOutOfBoundsException handled");
		}
		
		System.out.println("hello");
		
	}

}

