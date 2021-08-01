package April;

public class sample1 
{
 String name;
 int rno;
 int no1;
 int no2;
 int no3;
 sample1(String a,int b)
 {
	 name=a;
	 rno=b;
	
 }
 sample1(int x,int y,int z)
 {
	 no1=x;
	 no2=y;
	 no3=z;
 }
 
 public static void main(String[] args) 
 {
	 sample1 s1=new sample1("Akshay",1);
	 s1.m1();
     sample1 s2=new sample1(10,10,10);
	 s2.m1();
}
 public void m1() {
	 System.out.println(name+rno);
	 System.out.println(no1+no2+no3);
 }

}
