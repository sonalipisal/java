package April;

public class parameter_zero
{
  public static void main(String[] args) 
  {
	System.out.println("method started");
	//call static method
	addition();

	System.out.println("method ended");
  }
  
  //Zero parameter
  public static void addition()
  {
	  int a=10;
	  int b=30;
	  int c =a+b;
	  
	  System.out.println(c);
	
  }
}
