package object_variable;

public class static_use 
{
	public static void main(String[] args) {
		employee sonali=new employee();
		sonali.id=1;
		employee.ceo="peter";
		
		employee monali=new employee();
		monali.id=2;
		employee.ceo="peter";
		
		employee akshay=new employee();
		akshay.id=3;
		employee.ceo="mark";
		
		sonali.m1();
		monali.m1();
		akshay.m1();
		
	}
	
	
}
