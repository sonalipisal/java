package constructor;

public class parameter 
{
// variable declaration
	String sName; // global variable -- non static
	
	// example-without parameter constructor
        parameter()
        {
		sName = "sanjay";
		System.out.println("running constructor");
	    }

	public static void main(String[] args) {

		 parameter s2 = new  parameter (); 

		s2.m1();//object name.non static method
	
	}

	// usage
	public void m1()
	{
		System.out.println("running non-static regular method");
		System.out.println(sName);  
	}
	
}
