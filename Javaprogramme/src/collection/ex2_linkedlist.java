package collection;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class ex2_linkedlist 
{
  public static void main(String[] args)
  {
	  LinkedList ll=new LinkedList();
	  
	  ll.add("Sonali");
	  ll.add(100);
	  ll.add('A');
	  ll.add(100);
	  ll.add(null);
	 
	  System.out.println(ll);
	  
	  System.out.println(ll.isEmpty());
	  System.out.println(ll.get(0));
	  System.out.println(ll.contains(100));
	  
	  
	 ll.add(1,200);

	 	 //System.out.println(ll);
	 ll.remove(5);
	 System.out.println(ll);
	 
	 
	System.out.println("print info iteretor cursor");
	
   	Iterator itr = ll.iterator();

   	while(itr.hasNext())
   	{
   	   	System.out.println(itr.next());
   	}
   	
   	
   	System.out.println("print info list iteretor cursor");
   	ListIterator litr = ll.listIterator();
   	while(litr.hasNext())
   	{
   		System.out.println(litr.next());
   	}
   	
   	System.out.println("print info for loop");
   	for(int i=0;i<=ll.size()-1;i++)
   	{
   		System.out.println(ll.get(i));
   	}
   	System.out.println("print info for each loop");

   	for(Object str:ll)
   	{
   		System.out.println(str);
   	}
   	
   	
}
  
  
}
