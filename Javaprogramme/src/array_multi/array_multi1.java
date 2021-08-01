package array_multi;

public class array_multi1 
{
public static void main(String[] args) 
{
	//col     0   1   2  3
	//row 0  10  20  30 35
 //	      1  40  50  60 65
//	      2  70  80  90 95
	
	int ay[][]= {{10,20,30,35},{40,50,60,65},{70,80,90,95}};
	
	for(int i=0;i<=2;i++)
	{
		for(int j=0;j<=3;j++)
		{
			System.out.print(ay[i][j]+" ");
		}
		System.out.println();
	}
	
}
}
