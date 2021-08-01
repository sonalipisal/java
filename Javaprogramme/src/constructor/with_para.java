package constructor;

public class with_para
{
 String user;
 int pass;
 String mail;
 
    with_para(String c1,int c2,String c3)
   {
	 user=c1;
	 pass=c2;
	 mail=c3;
	 
   }
 
	
	public static void main(String[] args) 
	{
		with_para s1=new with_para("sonali",1234,"sona");
		s1.stud();
	}
	public void stud()
	{
		
		System.out.println("UserName:-"+user);
		System.out.println("Password:-"+pass);
		System.out.println("Email:-"+mail);
	}
}

