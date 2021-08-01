package collection;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class ex5_linkedHashset
{
   public static void main(String[] args) 
   {
	   LinkedHashSet lhs=new LinkedHashSet();
	   
	   lhs.add("nitali");
	   lhs.add(100);
	   lhs.add('A');
	   lhs.add(null);
	   lhs.add(100);
	   lhs.add(null);
	   
	   System.out.println(lhs);
	   
	   System.out.println("---Print info in hashset using iterator----");
	   
	   Iterator str = lhs.iterator();
	   while(str.hasNext())
	   {
		  System.out.println(str.next());
	   }
	   System.out.println("---Print info in hashset using for each loop----");
	   
	   for(Object tr:lhs)
	   {
		   System.out.println(tr);
	   }
	   
	   
	   
	   
}
}
