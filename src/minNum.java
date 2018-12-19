

public class minNum 
{
  public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		int ary[][] = {{12,3,4},{5,10,7},{11,12,3}};
		int min = ary[0][0];
		int rowNo = 0;
		int colNo = 0;
		//finding the minimum number for the two dimensional array
		for(int row = 0; row < 3; row++) 
		{
		  for (int col = 0; col < 3; col++) 
			 {
				if ( min > ary[row][col]) 
				{
					min = ary[row][col];
					rowNo = row;
				    colNo = col;
				}
			 }
		 }System.out.println("minimum number is: "+ min);
		 
		 rowNo = rowNo + 1;
		 
		 //finding the maximum number from the row of minimum number
		 int max = ary[0][colNo];
		 for( int nindx = 0; nindx < 3; nindx ++) 
		 {
			  if (max < ary[nindx][colNo])
			  {
				  max = ary[nindx][colNo];
			  }
			 
		 }System.out.println(max);
	}
}
