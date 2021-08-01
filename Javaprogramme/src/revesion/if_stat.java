package revesion;

public class if_stat 
{
public static void main(String[] args) {
	String UN="ABC";
	int pass=123;
	
	if(UN=="ABCd")
	{
		System.out.println("CORRECT UN");
	
	
		if(pass==123)
		{
			System.out.println("correct pass");
		}
		else 
			{
				System.out.println("incoorect pass");
			}
		
	}
	else
	{
		System.out.println("incorrect username login failed");
	}
}
}
