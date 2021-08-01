package multiple_inheritance;

public class son implements father,mother
{
  public void car()
  {
	  System.out.println("father interface= car method completed");
  }
  public void home()
  {
	  System.out.println("mother interface= home method completed");
  }
}
