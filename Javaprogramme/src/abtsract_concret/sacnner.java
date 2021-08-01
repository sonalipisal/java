package abtsract_concret;

import java.util.Scanner;

public class sacnner 
{
public static void main(String[] args) {
	 Scanner scan = new Scanner(System.in);
	 
	 System.out.println("enter num1:--");
	 int num1 = scan.nextInt();
	 
	 
	 System.out.println("enter num2:--");
	 int num2 = scan.nextInt();
	 System.out.println("Result");
	 System.out.println(num1+num2);
	 
	 
	 System.out.println("student name");
	 
	 String name = scan.next();
	 System.out.println(name);
}
}
