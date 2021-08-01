package collection;

import java.util.HashSet;
import java.util.Iterator;

public class ex4_hashset
{
public static void main(String[] args) 
{
	HashSet hs=new HashSet();
	
	hs.add("Sonali");
	hs.add(100);
	hs.add('A');
	hs.add(100);
	hs.add(null); // only 1 null value allowd
	hs.add(100);// duplicate value not allowed
	hs.add(null);
	System.out.println(hs);
	System.out.println(hs.size());  // 4
	System.out.println(hs.contains(100));  //true
	System.out.println(hs.isEmpty());//false
	
	System.out.println("---Print info in hashset using iterator----");
	Iterator itr = hs.iterator();
	while(itr.hasNext())
	{
		System.out.println(itr.next());
	}
	System.out.println("---Print info in hashset using foreach----");
	for(Object str:hs)
	{
		System.out.println(str);
	}
	
	
	
}
}
