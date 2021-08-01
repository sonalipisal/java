package collection;

import java.util.Iterator;
import java.util.TreeSet;

public class ex6_treeset 
{
  public static void main(String[] args) {
	
	  TreeSet tr=new TreeSet();
	  
	  tr.add("nitali");
	  tr.add("Ganesh");
	  tr.add("sonali");
	  
	  
	 
	  System.out.println(tr); 
	  System.out.println("print info using iterator");
	  Iterator s1 = tr.iterator();
	  while(s1.hasNext())
	  {
		  System.out.println(s1.next());
	  }
	  System.out.println("print info using for each loop");
	  
	  for(Object str:tr)
	  {
		  System.out.println(str);
	  }
}
}
