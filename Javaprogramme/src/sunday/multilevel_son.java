package sunday;

public class multilevel_son extends multilevel_mother 
{
public static void main(String[] args) 
{
	multilevel_son s2=new multilevel_son();
	s2.bike();
	s2.car();
	s2.gold();
}


public void bike()
{
	System.out.println("R15");
}
}
