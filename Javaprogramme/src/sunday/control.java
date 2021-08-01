package sunday;

public class control 
{
	
public static void main(String[] args) 
{
	int marks=75;
	//if &else if
	if(marks>=70)
	{
		System.out.println("distinction");
	}
	else if(marks>=60)
	{
		System.out.println("pass");
	}
	else
	{
		System.out.println("fail");
	}
	
	//nested
	String un="abc";
	int pwd=1234;
	
	if("abcd"==un)
	{
		System.out.println("un correct");
		if(123454==pwd)
		{
			System.out.println("pwd correct===login completed");
		}
		else 
		{
			System.out.println("pwd wrong");
		}
	}
	else
	{
		System.out.println("un wrong login fialed");
	}
	
	//switch
	int day=1;
	switch(day)
	{
	case 1: System.err.println("monday");
	break;
	
	case 2: System.out.println("tue");
	break;
	
	case 3: System.out.println("wed");
	break;
	
	}
	
}
}

