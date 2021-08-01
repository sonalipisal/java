package generalization;

public class main_gen 
{
  public static void main(String[] args) {
	
	  System.out.println("Saving Account Info");
	  saving s=new saving();
	  s.cashwithdrw();
	  s.cashdeposit();
	  s.balance();
	  s.newfe_a();
	  
	  System.out.println("Current Account Info");
	  current c=new current();
	  c.cashwithdrw();
	  c.cashdeposit();
	  c.balance();
	  
	  System.out.println("Salary Account Info");
	  salary s1=new salary();
	  s1.cashwithdrw();
	  s1.cashdeposit();
	  s1.balance();
}

}
