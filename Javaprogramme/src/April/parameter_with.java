package April;

public class parameter_with
{
  public static void main(String[] args)
  {
	  studinfo("Appu",101,'A',68.10F);
	  studinfo("Akshay",102,'B',70);
	 
	
  }
  
  //with parameter
  public static void studinfo(String sname,int rno,char sgrade,float per)
  {
	  System.out.println("Student Name:="+sname);
	  System.out.println("Roll no:="+rno);
	  System.out.println("Grade:="+sgrade);
	  System.out.println("Percentage:="+per);
	  
  }
}
