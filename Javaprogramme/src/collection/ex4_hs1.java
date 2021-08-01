package collection;

import java.util.ArrayList;
import java.util.HashSet;

public class ex4_hs1 
{
public static void main(String[] args) {
	
	
	ArrayList a1=new ArrayList();
	
	a1.add("appu");
	a1.add(100);
	a1.add('A');
	a1.add(100);
	a1.add(null);
	a1.add(null);
	System.out.println(a1);
	
	HashSet hs=new HashSet(a1);
	System.out.println(hs);
	
}
}
