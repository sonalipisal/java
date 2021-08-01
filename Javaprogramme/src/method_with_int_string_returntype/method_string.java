package method_with_int_string_returntype;

public class method_string
{
public static void main(String[] args)
{
	System.out.println(student("nitali"));
	
	String str1=student("sonali");
	System.out.println(str1);
}
public static String student(String name)
{
	String str=name.toUpperCase();
	
	return str;
}
}
