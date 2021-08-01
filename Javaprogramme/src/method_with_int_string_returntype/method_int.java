package method_with_int_string_returntype;

public class method_int 
{ 
	//a+b==c  c/d
	
	int a;
	int b;
	
	public static void main(String[] args) 
	{
		
		int sum=add(50,50);
		int d=5;
		//System.out.println(sum);
		
		int divide=div(sum,d);
		System.out.println(divide);
		
	}
 public static int add(int a,int b)
 {
	int c=a+b;
	return c;
	
 }
 public static int div(int a,int b)
 {
	int d=a/b;
	return d;
	
 }
 

}
