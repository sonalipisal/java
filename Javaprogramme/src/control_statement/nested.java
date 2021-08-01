package control_statement;

public class nested
{
public static void main(String[] args)
{
	String user="abc";
	int pass=12345;
	
	if("abc"==user)
	{
		System.out.println("Correct Username");
		if(1245==pass)
		{
			System.out.println("Correct Password");
		}
		else
		{
			System.out.println("Incorrect password ");
		}
     
	}	
	else 
    {
   	 System.out.println("Incorrect username login failed");
    }
}
}
