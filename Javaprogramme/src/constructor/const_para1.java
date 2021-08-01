package constructor;

public class const_para1 
{     
	  
	  int a;
	  int b;
	  int c;
	  int d;
	  
	  
	  
	  const_para1(int p1,int p2, int p3)
	  {
		  a=p1;
		  b=p2;
		  c=p3;
		  d=a*b*c;
		  
	  }

	
	
	public static void main(String[] args)
	{
		const_para1 obj=new const_para1(20,30,40);
				obj.stud();
		
	}
	
	public void stud()
	{
		System.out.println("Sonali Pisal");
		System.out.println("answer:=="+d);
	}
}
