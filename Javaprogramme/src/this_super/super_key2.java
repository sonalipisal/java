package this_super;

public class super_key2 extends super_key1
{
  int y=100;  //global
  
  public void m1()
  {
	  int z=150;
	  System.out.println(super.x);
	  System.out.println(this.y);
	  System.out.println(z);
	  
	 
  }
}
