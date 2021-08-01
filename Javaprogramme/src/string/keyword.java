package string;

public class keyword
{
public static void main(String[] args) 
{
	//without using keyword
	String s1="sonali";
	String s2="pisal";
	String s3="";
	
	System.out.println(s1.length());//6
	
	
	System.out.println(s1.toUpperCase());//SONALI
	
	System.out.println(s2.toLowerCase());// pisal
	
	System.out.println(s1.equals(s2));//false
	
	System.out.println(s1.equalsIgnoreCase(s2));
	
	System.out.println(s1.contains(s2));//chk sequence of char false
	
	System.out.println(s3.isEmpty());// true
	
	System.out.println(s1.charAt(2));  //n
	
	System.out.println(s2.startsWith("p"));//true
	
	System.out.println(s1.endsWith("i"));//true
	
	System.out.println(s2.substring(1, 4));//isa
	
	System.out.println(s1.concat("  pawar"));
	
	System.out.println(s1.indexOf('n'));//2
	
	System.out.println(s1.lastIndexOf('a'));//3
	
	System.out.println(s2.replace("pisal", "deshmukh"));
	
	System.out.println(s2);
}
	
}
