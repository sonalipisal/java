package collection;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class ex1_arraylist
{
public static void main(String[] args) {
	
	

	ArrayList a1=new ArrayList();
	
	a1.add("sonali");
	a1.add(100);
	a1.add('A');
	a1.add(100);
	a1.add(65.5f);
	a1.add(null);
	a1.add(null);
	//System.out.println(a1);
	a1.add(4,200);
	//System.out.println(a1);
	a1.remove(4);
	//System.out.println(a1);
	
	System.out.println("Print info in Arraylist using iterator cursor");
	Iterator itr = a1.iterator();
	while(itr.hasNext())
		{
		System.out.println(itr.next());
		}
	
	System.out.println("Print info in Arraylist using list iterator cursor");
	     ListIterator litr = a1.listIterator();
	while(litr.hasNext())
	{
		System.out.println(litr.next());
	}
	System.out.println("Print info in Arraylist using for loop");
	for(int i=0;i<=a1.size()-1;i++)
	{
		System.out.println(a1.get(i));
	}
	
   
	
}
}


