package array_multi;

public class multi 
{
	//col 0   1   2  3
//row 0  10  20  30 35
//    1  40  50  60 65
//    2  70  80  90 95
	public static void main(String[] args)
	{
		int ar1[][]=new int [3][4];

				ar1[0][0]=10;
				ar1[0][1]=20;
				ar1[0][2]=30;
				ar1[0][3]=35;
				
				ar1[1][0]=40;
				ar1[1][1]=50;
				ar1[1][2]=60;
				ar1[1][3]=65;
				
				ar1[2][0]=70;
				ar1[2][1]=80;
				ar1[2][2]=90;
				ar1[2][3]=95;
				
				//System.out.println(ar1[0][3]);
				
				for(int i=0; i<=2;i++)
				{
					for(int j=0;j<=3;j++)
					{
						System.out.print(ar1[i][j]+"  ");
						
					}
					System.out.println();
					
				}
				
		
		
	}

}
