package practice;

public class sub_superkey extends super_key
{
	int b=20;
	public void m1()
	{
		int b=30;
		System.out.println(super.b);
		System.out.println(this.b);
		System.out.println(b);
	}
}
