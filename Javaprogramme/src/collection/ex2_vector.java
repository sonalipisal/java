package collection;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class ex2_vector 
{
  

public static void main(String[] args) 
  {
	  Vector v=new Vector();
	  
	  v.add("appu");
	  v.add(10);
	  v.add('A');
	  v.add(75.5f);
	  System.out.println(v);
	  
	  System.out.println("Print info in Arraylist using iterator cursor");
	  
	    Iterator itr = v.iterator();
	    while(itr.hasNext())
	    {
	    	System.out.println(itr.next());
	    }
	    System.out.println("Print info in Arraylist using list iterator cursor");
	    ListIterator litr = v.listIterator();
		  
	   while(litr.hasNext())
	   {
		  System.out.println(litr.next()); 
	   }
	   System.out.println("Print info in Arraylist using list enumeration cursor");
	   Enumeration en = v.elements();
	   while(en.hasMoreElements())
	   {
		   System.out.println(en.nextElement());
	   }
	   System.out.println("Print info in Arraylist using list for loop");
	   
	   for(int i=0;i<=v.size()-1;i++)
	   {
		   System.out.println(v.get(i));
	   }
	   System.out.println("Print info in Arraylist using list foreach loop");
	 
	for(Object str:v)
	{
		System.out.println(str);
	}
}
 
}
