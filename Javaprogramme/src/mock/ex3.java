package mock;

public class ex3 
{
public static void main(String[] args) {
//	
//	int a=20;
//	for(int i=20;i>1;i--)
//	{
//		System.out.println(i);
//		System.out.println();
//	//}
	
	//12345
	//67892
	  int ar[][]= {{1,2,3,4,6},{6,7,8,9,2},{1,3,4,5,5}};
	  for(int i=0;i<=2;i++)
	  {
		  for(int j=0;j<=4;j++)
		  {
			  System.out.print(ar[i][j]+" ");
			 
		  }
		  System.out.println();
		  System.out.println(ar[i].length);
		 
		  
	  }

	  
	  String str="Sonali";
	  char m=str.charAt(str.length()-1);
	  System.out.println(m);
	  
	  
}
}
