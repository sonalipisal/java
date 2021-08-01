package casting;

public class upcasting 
{
  public static void main(String[] args) 
  {
	  //sub_cast s1=new sub_cast();
	  //s1.bike();
	  //s1.car();
	  //s1.money();
	 // s1.home();
	  
	  
	  //TO create a object of subclass needs to provide ref of super class
	  
	  super_cast m1=new sub_cast();
	  m1.car();
	  m1.home();
	  m1.money();
	  
	  
	
}
}
